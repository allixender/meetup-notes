# Back to Basics: Setup Play Framework in Java

At first we download the Scala Build Tool - SBT: http://www.scala-sbt.org/download.html

A web application with the Play Framework can be developed in Scala or Java, or even both. But the build process is configured by SBT.

For Play 2.5.x you should use minimum version of sbt 0.13.15 or sbt 0.13.16.

Extract sbt into a folder and set the SBT_HOME environment variable ot that folder, e.g. Bash Shell:


```bash
export SBT_HOME=/home/user/sbt-0.13.16
```

It will make things also easier, if you make the sbt binary executable available through your PATH environmenta variable, e.g.:

```bash
export PATH=$PATH:$SBT_HOME/bin
```

Don't override your PATH, only append the bin folder of sbt :-)

Now you can download the Play-Java-Starter, that we used in the workshop:

https://www.playframework.com/download#starters

Or fork/clone/download directly from Github: 

https://github.com/playframework/play-java-starter-example/tree/2.5.x

We used the 2.5.x version in the workshop. The main differences are that in the newer versions less and less (in particular global) application state 
is managed by Play itself but by you through Dependency Injection, e.g. with Guice.

The file `build.sbt` manages the build process. Here you declare dependencies, project name and version and build tasks.

The file `plugins.sbt`in `project`folder declares (sbt) plugins, e.g. the Play Framework version support and other build support tools/plugins, for example webjars (see http://www.webjars.org/)

The folder layout is as follows:

- `app` - here lies the application source, typically for controllers, models (db access), views, etc, services, utils, also dynamic assets, e.g. less or coffeescript that can be compiled with webjar plugins
  - app/controllers - here we edited a little bit the HomeController functions
  - app/views - here we edited some view rendering
- `conf`- here is main application configuration, especially routes, application.conf and also db evolutions will be here
  - conf/application.conf
  - conf/routes - here we edited some routes to different functions/methods in the HomeController
- `public` - here can be static assets, like images that you want to link into views. you can also puts css and javascripts here.

To get sbt to compile, build, run and package your web app, following cmds are useful:

```bash
# go into the root folder of you app and start sbt with our arguments
sbt

# it will start loading all dependencies it needs for setting its own build process up
# you will then enter the sbt console, here you can issue commands such as:

# compiles the source
compile

# starts a dev server right there, with hot reload
run

# run tests in `test` folder
test

# create a zip with start script, will start as own Java web app process
dist

```

For production you will need to generate a secret, this will be used for hashing cookies etc.

https://playframework.com/documentation/2.5.x/ApplicationSecret

```
# in the sbt console
playGenerateSecret

[info] Generated new secret: UQ<S8v>8gum8Py109Brd2YLG0rB`P[OcZWYyX:?XH:t<;;drO4u<J3J?ZAaJeKDm
[success] Total time: 0 s, completed 19/09/2017 3:56:09 PM

```

You can either put this into the application.conf file or provide it as a commandline flag when starting the dist play server app:

```
bin/play-java -Dplay.crypto.secret='UQ<S8v>8gum8Py109Brd2YLG0rB`P[OcZWYyX:?XH:t<;;drO4u<J3J?ZAaJeKDm'
```

And by the way, the memory config switches are like so (not sure what I messed p in the session though :-) ):

```
# make sure it fits your production environment if you have to specify those
bin/play-java -J-Xms256M -J-Xmx768m

# smaller, megabytes M or m should have worked both
# sys monitor still indicated that this jvm process took about 180MB though
bin/play-java -J-Xms64m -J-Xmx128M
```


Useful documentation links to start exploring:

- https://www.playframework.com/documentation/2.5.x/Home
- https://www.playframework.com/documentation/2.5.x/JavaHome
- https://www.playframework.com/documentation/2.5.x/IDE

Have fun.


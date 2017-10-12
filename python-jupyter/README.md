## Python Pandas Coding Meetup

In this meetup we want to play with the 
Jupyter Notebook (http://jupyter.org/) and do some data 
wrangling with Python, Pandas (http://pandas.pydata.org/) and co.,
some data analysis and visualisation.

https://www.meetup.com/preview/Coding-Dojo-Tartu/events/243543546

https://www.facebook.com/events/2004683793149132/

## Preparations

Miniconda is an encapsulated versatile virtual python environment installer, 
that works under the hood of the big Anaconda python distribution.
Miniconda is basically a mini version of Anaconda that includes only the conda package manager and its dependencies:

https://conda.io/miniconda.html

Python 3.6, 64-bit (exe installer)
https://repo.continuum.io/miniconda/Miniconda3-latest-Windows-x86_64.exe

BEWARE:

- To install miniconda SYSTEM-WIDE for ALL users, this does require administrator permissions; 
  every users can then create their own environments with the conda tool.
- Please do NOT make Conda the default python for the system if you don't want it to interfere with other Python installations you might have,
  eg. Pythons of ArcGIS and QGis etc

Additional install information:
https://conda.io/docs/user-guide/install/index.html

## Creating environments and install components

How to use the conda command? Open the Anaconda/conda command prompt from the Start menu:

`conda create` basically represents a typical Python virtualenv command.

https://conda.io/docs/_downloads/conda-cheatsheet.pdf

We want to use a Python version 3.4 because some of the libraries/tools we want to work with supposedly only are supported up to Python 3.4.
Here it becomes obvious how practical virtual environments can be. They help you to keep various Python versions around without messing up your system.
 
```shell
(C:\dev\conda3) conda create --name py34 python=3.4

and then show all environments:

#> conda env list
```

Now we want to activate that environment and start working with it:

```shell
activate py34
```

```shell
(py34) conda install jupyter
```

latest: http://pandas.pydata.org/pandas-docs/version/0.20.3/index.html (https://pandas.pydata.org/pandas-docs/stable/index.html)

0.19.2 (used by Geopandas): http://pandas.pydata.org/pandas-docs/version/0.19.2/

```shell
(py34) conda install pandas=0.19.2
```

## Getting started with the Jupyter notebook

```shell
cd C:\Users\Alexander\Documents\meetup\python-jupyter

(py34) jupyter notebook
```

## Geospatial data wrangling with Geopandas

http://geopandas.org/index.html

```shell
(py34) conda install -c conda-forge geopandas
```

## licenses and Copyright Attributions

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">
<img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/80x15.png" /></a>
<br />
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Attribution-ShareAlike 4.0 International License</a>.

This work uses some materials from the following repositories:
- https://github.com/leriomaggio/python-in-a-notebook
- https://github.com/jvns/pandas-cookbook
GeoPandas intro
===============

http://geopandas.org/index.html

GeoPandas is an open source project to make working with geospatial data in python easier.
GeoPandas extends the datatypes used by pandas to allow spatial operations on geometric types.
Geometric operations are performed by shapely.
Geopandas further depends on fiona for file access and descartes and matplotlib for plotting.

We need to install the Geopandas python library and two libraries that we use to read and write from Excel-Spredsheets.

```shell
(py34) conda install -c conda-forge geopandas

(py34) conda install openpyxl xlrd
```

Maybe we also need "openpyxl", but let's try to not mix too many libs for same/similar purposes.

Table of Contents
=================

1. [Basic Geoplot Shapefile](01%20Basic%20Geoplot%20Shapefile.ipynb)
2. [Load CSV and make GeoDataFrame](02%20Load%20CSV%20and%20make%20GeoDataFrame.ipynb)
3. [Load and join from Excel sheets](03%20Load%20and%20join%20from%20Excel%20sheets.ipynb)

* Exercise: [Nested Data Frames - Storm episodes and events](Nested%20DataFrames%20-%20Storms.ipynb)

More stuff
==========

* 75000 city weather info csv files (for big data in 2.) https://storage.googleapis.com/smart-backup/cities-weather-yearly.zip
* nice tutorials to Geopandas http://jonathansoma.com/lede/foundations-2017/classes/geopandas/mapping-with-geopandas/

License
=======

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br />

This work is licensed under a [Creative Commons Attribution-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-sa/4.0/)


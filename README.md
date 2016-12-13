# Harry Potter Kata

  - Source: [http://www.codingdojo.org/cgi-bin/index.pl?action=browse&id=KataPotter&revision=41](http://www.codingdojo.org/cgi-bin/index.pl?action=browse&id=KataPotter&revision=41)  
  - Author: Sebastien Mosser
  - Version: 1.0 (12.2016)
  - Prerequisites: Java 8, maven 3.
  - _This repository is based on an original discussion with Benjamin Benni & Clément Duffau._

## Contents

This repository contains the following material:

  - [`slides.pdf`](https://github.com/polytechnice-si/3A_GL_KataPotter/blob/master/slides.pdf): presentation(~40 minutes) used to present this Kata to undergrad students in software engineering (some slides are in French).
  - [kata](https://github.com/polytechnice-si/3A_GL_KataPotter/tree/master/kata): the business code of the Harry Potter Kata
    - [`raw`](https://github.com/polytechnice-si/3A_GL_KataPotter/tree/master/kata/src/main/java/raw) package: original solution found on the internet
    - [`oo`](https://github.com/polytechnice-si/3A_GL_KataPotter/tree/master/kata/src/main/java/oo) package: object-oriented version
  - [benchmark](https://github.com/polytechnice-si/3A_GL_KataPotter/tree/master/benchmark): benchmark to measure the differences (_w.r.t._ performances) between the initial and the object-oriented versions of the code.
  - Each version comes with an associated [test suite](https://github.com/polytechnice-si/3A_GL_KataPotter/tree/master/kata/src/test/java)

## Specifications

  - We consider the five firsts books fo the Harry Potter series.
  -  Each book costs 8 €
  -  Discount policies based on the number of different books to purchase:
    -  2 different books: 5%
    -  3 different books: 10%
    -  4 different books: 20%
    -  The whole series: 25%
  - The discount is eventually applied only on the relevant books


## Compiling and Running the System

The code is shipped as a multi-module maven project. The root project contains two modules: `kata` and `benchmark` (and `benchmark` references `kata`). To install the project, simply ask maven to do so:

    mosser@azrael potter$ mvn install 	

To run the benchmark (it takes around 40 minutes):

    mosser@azrael potter$ java -jar benchmark/target/benchmarks.jar    
 

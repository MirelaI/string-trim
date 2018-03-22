# Trim string by chars quota

Given a string, that can have groups of the same character, trim the sequences of 
the same character to a limit of a provided quota. 

## Example

* Input: "aaabbbbdd", quota: 1 -> Output: "abd"
* Input: "abbbbddd", quota: 5 -> Output: "abbbbddd"
* Input: "aaaabbbddd", quota: 0 -> Output: ""
* Input: "aaabddd", quota: 2 -> Output: "aabdd"

## Pre requisites
String Trim is using SBT as the build tool. In order to run the trim utility, you
need to have installed [SBT](http://www.scala-sbt.org/) first.

## Run instructions

1. Clone the current repo
```
git clone git@github.com:MirelaI/string-trim.git
```
2. Open sbt console from the string-trim repo
```
$ cd string-trim
$ sbt
```
3. Once in the sbt console start playing with the application. 
See below some useful commands:
```
# Compile the bundle
> compile
...
# Run tests
> test
...
# Run only one test
> testOnly StringTrimTest
...
```
# THIS IS STILL A WIP, UNCOMPLETED

# winter-break-fun
Want to brush up on basic Java skills over winter break! This is the repo for you!

![Iorn Pants](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRikbIBEOVDEtnc82lAeFD9w8sQA3Orfg8GFLIHrW_tYg-qb_2sDlOMfeOYBcpttAxtMX0&usqp=CAU)
### Instructions
There are several assignments in [this Google Doc](https://docs.google.com/document/d/1NLcqq41JP_fEn9IeM-8WH5F5AcdkmE5eqUX8m_-3nhY/edit?usp=sharing)\
Follow along with the lessons and instructions there in order to learn more about Java!
### Setup
Clone this repo and branch off of main\
Then, navigate down to ```\lib\src\main\java``` and run a build (next section)

### Test\Build!
Once you've determined which assignments you'd like to do, go write up some code in the corresponding files.
You can then run a gradle test to see if your solutions are correct!
<br/><br/>
In order to run a test (or a build) you have multiple options.<br/><br/>
You could hit ```{ctrl} + {shift} + b + b```<br/><br/>
or if that doesn't work, you could go the old-fashioned way and run<br/><br/>

```
{ctrl} + {shift} + p
WPILib: Build Robot Code
java
```
Don't touch the tests I've written, as that's not the point lol. However, you can write your own (add more tests) and use them to help debug your problems.

### Spotless Errors?!
Make sure to save your files with ```{ctrl} + s```\
I've configured it so that spotless will automatically format your files when you save, so it'll make your code look pretty.
<br/><br/>
If you hate me, then you can also use ```./gradlew spotlessApply``` in the terminal to format all files at once
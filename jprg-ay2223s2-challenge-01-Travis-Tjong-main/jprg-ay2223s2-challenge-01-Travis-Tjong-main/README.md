<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-challenge">About Challenge</a>
      <ul>
        <li><a href="#q1">Q1</a></li>
        <li><a href="#q2">Q2</a></li>
        <li><a href="#q3">Q3</a></li>
        <li><a href="#q4">Q4</a></li>
        <li><a href="#q5">Q5</a></li>
      </ul>
    </li>
    <li>
      <a href="#how-to-start">How To Start</a>
    </li>
    <li>
      <a href="#how-to-submit">How To Submit</a>
    </li>
  </ol>
</details>

## About Challenge
This challenge is made in a way that you can check if what you submitted is correct.

### Q1
Question 1 requires you to use the user input to greet the user. The program will look like the following.

* Example 1
```
Enter your name:
Gary
Hello Gary from SP SOC!
```

* Example 2
```
Enter your name:
Jessie Kwan
Hello Jessie Kwan from SP SOC!
```

### Q2
Question 2 require you to create a program that get the number of berries from the gatherers and distribute them evenly.

* Example 1
```
Gatherer #1, please enter how much berries you found. (Enter -1 to End) :
6
Gatherer #2, please enter how much berries you found. (Enter -1 to End) :
7
Gatherer #3, please enter how much berries you found. (Enter -1 to End) :
-1
Number of Gatherers: 2
Total Berries Found: 13
Each Gatherer Gets: 6
Remaining Berries Not Distributed: 1
```

* Example 2
```
Everyone search for berries in the forest.
After gathering berries, they will come together to share equally.
Because it must be equal, there will be remainders.
This program will find the remainders and how many berries each player gets.

Gatherer #1, please enter how much berries you found. (Enter -1 to End) :
79
Gatherer #2, please enter how much berries you found. (Enter -1 to End) :
56
Gatherer #3, please enter how much berries you found. (Enter -1 to End) :
88
Gatherer #4, please enter how much berries you found. (Enter -1 to End) :
35
Gatherer #5, please enter how much berries you found. (Enter -1 to End) :
34
Gatherer #6, please enter how much berries you found. (Enter -1 to End) :
67
Gatherer #7, please enter how much berries you found. (Enter -1 to End) :
34
Gatherer #8, please enter how much berries you found. (Enter -1 to End) :
-1
Number of Gatherers: 7
Total Berries Found: 393
Each Gatherer Gets: 56
Remaining Berries Not Distributed: 1
```


### Q3
This question need the program to generate a rectangle using the length and width given by the user.

* Example 1
```
This program will generate a rectangle with the symbol $.
Enter the length of the rectangle (Integer Only): 4
Enter the width of the rectangle (Integer Only): 4

$$$$
$$$$
$$$$
$$$$
```

* Example 2
```
This program will generate a rectangle with the symbol $.
Enter the length of the rectangle (Integer Only): 9
Enter the width of the rectangle (Integer Only): 7

$$$$$$$$$
$$$$$$$$$
$$$$$$$$$
$$$$$$$$$
$$$$$$$$$
$$$$$$$$$
$$$$$$$$$
```

### Q4
This question compare 2 players score and decide if anyone of them wins.

* Example 1
```
This program will decide who win base on score (in decimals).
Player 1, enter your score: 8
Player 2, enter your score: 6
Player 1 wins.
```

* Example 2
```
This program will decide who win base on score (in decimals).
Player 1, enter your score: 666.66
Player 2, enter your score: 666.665
Player 2 wins.
```

### Q5
This question allow user to store a list of colours and select 1 to view.

* Example 1
```
This program will make an array to store a list of colours.
How many colours will you want to store: 7
Enter the colour name: Red
Enter the colour name: Orange
Enter the colour name: Yellow
Enter the colour name: Green
Enter the colour name: Blue
Enter the colour name: Indigo
Enter the colour name: Purple
Pick a colour using the array number: 4
The colour at #4 is Blue
```
* Example 2
```
This program will make an array to store a list of colours.
How many colours will you want to store: 3
Enter the colour name: Green
Enter the colour name: Red
Enter the colour name: Blue
Pick a colour using the array number: 0
The colour at #0 is Green
```

## What You Need
You will need the following
* [Download Git](https://git-scm.com/downloads)
* [Setup Git for GitHub](https://docs.github.com/en/get-started/quickstart/set-up-git)

## How To Start
First you need to clone this git onto your computer using `git clone <YOUR GIT URL>`
* Open the project folder with Netbeans
* Work on the .java files located in the `src` folder
* It is autograded after you have committed

## How To Submit
To submit you need to use the git to update.
```
git add .
git commit -m "WRITE DESCRIPTION OF COMMIT"
git push
```
Sometime you are behind the latest commit. So you might need to pull before you push.
```
git pull
git push
```

<!-- MARKDOWN LINKS & IMAGES -->
[git-download-url]: https://git-scm.com/downloads
[github-setup-guide-url]: https://docs.github.com/en/get-started/quickstart/set-up-git


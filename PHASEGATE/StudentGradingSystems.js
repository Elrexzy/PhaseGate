const prompt = require("prompt-sync")();
function collectInputFromTeacher(){
	let numberOfStudent = Number(
		prompt("What is the number of students in your class? ")
    );
	let numberOfSubject = Number(
		prompt("How many subjects do they offer? ")
    );
	return[numberOfStudent, numberOfSubject];
 }

function scoreCollection (numberOfStudent, numberOfSubject){
	let score = [];
	for (let student = 0; student < numberOfStudent; student++){
    	let studentScores = [];

    	console.log("Entering scores for Student " + (student + 1));
    		for (let subject = 0; subject < numberOfSubject; subject++){
        	let score = Number(
            	prompt("Enter score for Subject " + (subject + 1) + " ")
        );

        while (score < 0 || score > 100){
          score = Number(
          prompt("Invalid score. Enter a value from 0 to 100: ")
            );
        }
        studentScores.push(score);
	  }
	    scores.push(studentScores);
    }
	return(scores);
}

function total(scores){
    let totals = [];
    for (let student = 0; student < scores.length; student++){
        let sum = 0;

        for (let subject = 0; subject < scores[student].length; subject++){
            sum = sum + scores[student][subject];
        }
        totals.push(sum);
    }
	return(totals);
}

function averageScore(totals,numberOfSubject){
    let averages = [];

    for (let index = 0; index < totals.length; index++) {
        let average = totals[student] / numberOfSubject;
        averages.push(average);
    }
    return averages;
}

function positions(totals) {
    let positions = [];

    for (let student = 0; student < totals.length; student++){
        let position = 1;

        for (let other = 0; other < totals.length; other++){
            if (totals[other] > totals[student]){
                position++;
            }
        }

        positions.push(position);
    }

    return positions;
}

function summary(numberOfStudent){
	
	return(summary);
}



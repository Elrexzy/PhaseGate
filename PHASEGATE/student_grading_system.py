number_of_student = int(input("What is the number of students in your class? "))

print("++++++++++++++++++++++++++++++++++++++++++++++++++")
print("Number of students at Elrexzy's High School:", number_of_student)
print("++++++++++++++++++++++++++++++++++++++++++++++++++")

number_of_subject = int(input("How many subjects do they offer? "))

print("Number of subjects offered:", number_of_subject)
print("++++++++++++++++++++++++++++++++++++++++++++++++++")

print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("Saved successfully!")

scores = []
totals = [0] * number_of_student
positions = [0] * number_of_student

for student in range(number_of_student):
    student_scores = []
    print(f"\nEntering scores for Student {student + 1}")

    for subject in range(number_of_subject):
        score = int(input(f"Enter score for Subject {subject + 1}: "))

        while score < 0 or score > 100:
            score = int(input("Invalid score. Enter a value from 0 to 100: "))
        student_scores.append(score)

        print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        print("Saved successfully!")

    scores.append(student_scores)

for count in range(number_of_student):
    sum_of_scores = 0
    for index in range(number_of_subject):

        sum_of_scores += scores[count][index]
    totals[count] = sum_of_scores

for count in range(number_of_student):
    positions[count] = 1
    
    for index in range(number_of_student):
        if totals[index] > totals[count]:
            positions[count] += 1

print("\n+++++++++++++++++++++++++++++++++++++++++++++++++++")
print("              STUDENT GRADE SUMMARY")
print("+++++++++++++++++++++++++++++++++++++++++++++++++++")

print(f"{'STUDENT':>12}", end="")

for index in range(number_of_subject):
    print(f"{'SUB' + str(index + 1):>8}", end="")

print(f"{'TOTAL':>10}{'AVERAGE':>10}{'POSITION':>10}")
print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")


for count in range(number_of_student):
    average = totals[count] / number_of_subject

    print(f"{'STUDENT ' + str(count + 1):>12}", end="")

    for index in range(number_of_subject):
        print(f"{scores[count][index]:>8}", end="")

    print(f"{totals[count]:>10}{average:>10.2f}{positions[count]:>10}")
print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

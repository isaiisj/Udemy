from question_model import Question
from data import question_data
from quiz_brain import QuizBrain

# List that will save question objects
question_bank = []

for question in question_data:
    # print(question["text"])
    # print(question["answer"])

    question_bank.append(Question(question["question"], question["correct_answer"]))

# print(question_bank[0].text)

# Creation of object that manages questions
quiz = QuizBrain(question_bank)

# keep showing questions until we finish the question bank
while quiz.still_has_question():
    quiz.next_question()

print("You've completed the quiz")
print(f"Your final score was: {quiz.score}/{quiz.question_number}")



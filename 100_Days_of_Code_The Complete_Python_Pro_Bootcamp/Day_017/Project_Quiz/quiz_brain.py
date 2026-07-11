class QuizBrain:
    def __init__(self, question_bank):
        self.question_number = 0
        self.question_list = question_bank
        self.score = 0

    def still_has_question(self):
        '''
        This method checks if there are questions left
        :return: boolean
        '''
        return self.question_number < len(self.question_list)

    def next_question(self):
        user_answer = input(f"Q.{self.question_number+1}: {self.question_list[self.question_number].text} (True/False)? ")
        self.check_answer(user_answer, self.question_list[self.question_number].answer)
        self.question_number += 1

    def check_answer(self, user_answer, correct_answer):
        '''
        This method checks if the correct answer was given
        :param user_answer:
        :param correct_answer:
        :return:
        '''
        if user_answer.lower() == correct_answer.lower():
            print("Correct!")
            self.score += 1
        else:
            print("Wrong!")

        print("The correct answer was: " + correct_answer)
        print(f"Your current score is: {self.score}/{self.question_number+1}\n")


package br.henrique.francisco.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "total_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //Pergunta 1
        val que1 = Question(
            1,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Austrália",
            "Uruguai",
            "França",
            1
        )
        questionsList.add(que1)

        //Pergunta 2
        val que2 = Question(
            2,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Estados Unidos",
            "Austrália",
            "Inglaterra",
            "Bélgica",
            2,
        )
        questionsList.add(que2)

        //Pergunta 3
        val que3 = Question(
            3,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Bélgica",
            "Rússia",
            "Alemanha",
            "Espanha",
            1,
        )
        questionsList.add(que3)

        //Pergunta 4
        val que4 = Question(
            4,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Itália",
            "Portugal",
            "Brasil",
            "Africa do Sul",
            3
        )
        questionsList.add(que4)

        //Pergunta 5
        val que5 = Question(
            5,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_denmark,
            "Canadá",
            "Dinamarca",
            "Suíça",
            "México",
            2,
        )
        questionsList.add(que5)

        //Pergunta 6
        val que6 = Question(
            6,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "México",
            "Austrália",
            "Inglaterra",
            1,
        )
        questionsList.add(que6)

        //Pergunta 7
        val que7 = Question(
            7,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Bélgica",
            "Havaí",
            "Espanha",
            "Alemanha",
            4,
        )
        questionsList.add(que7)

        //Pergunta 8
        val que8 = Question(
            8,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Portugal",
            "México",
            "Índia",
            "Emirados Árabes",
            3
        )
        questionsList.add(que8)

        //Pergunta 9
        val que9 = Question(
            9,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Vietnã",
            "Bielo-Russia",
            "Marrocos",
            1,
        )
        questionsList.add(que9)

        //Pergunta 10
        val que10 = Question(
            10,
            "A que país essa bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Austrália",
            "Nova Zelândia",
            "Reino Unido",
            "Jamaica",
            2,
        )
        questionsList.add(que10)

        return questionsList
    }



}
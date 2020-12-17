package br.henrique.francisco.quizapp

import android.icu.text.MessagePattern
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutUsViewModel : ViewModel() {

    val aluno: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val professor: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val curso: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}
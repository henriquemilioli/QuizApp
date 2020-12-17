package br.henrique.francisco.quizapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory() : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AboutUsViewModel::class.java)){
            return AboutUsViewModel() as T
        }
        throw IllegalArgumentException("Deve ser passada a classe ViewModel")
    }
}

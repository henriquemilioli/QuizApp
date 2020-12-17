package br.henrique.francisco.quizapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.about_us_fragment.*

class AboutUsFragment : Fragment() {

     private lateinit var aboutUsViewModel: AboutUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.about_us_fragment, container, false)
        aboutUsViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(AboutUsViewModel::class.java)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView.text = aboutUsViewModel.aluno.value
        textView2.text = aboutUsViewModel.professor.value
        textView3.text = aboutUsViewModel.curso.value
    }


}
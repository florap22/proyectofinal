package com.curso.android.app.practice.proyectofinal
import android.text.Editable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.practice.proyectofinal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  private lateinit var viewModel: CompViewModel

  override fun onCreate(savedInstanceState:Bundle?){
      super.onCreate(savedInstanceState)

      binding= ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)

      viewModel=ViewModelProvider(this).get(CompViewModel::class.java)
      binding.compareButton.setOnClickListener{
          val num1=binding.editText1.text.toString().toInt()
          val num2=binding.editText2.text.toString().toInt()

          val result= viewModel.compNum(num1,num2)

          binding.resulTextView.text = Editable.Factory.getInstance().newEditable(result)
    }
}
}
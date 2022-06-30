package dev.lavyne.fibonacciseriess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.lavyne.fibonacciseriess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var numberList=displayNumbers(100)
        println(numberList)
        binding.rvNumbers.layoutManager= LinearLayoutManager(this)
        binding.rvNumbers.adapter=RecyclerViewNumberAdapter(numberList)
    }
    fun displayNumbers(size:Int): List<Int> {
        val list=ArrayList<Int>()
        var first=0
        var second=1
        var sum=0
        while (sum <= size){
            print("$first")
            val next=first+second
            first=second
            second=next
            sum++
            list+=next
        }
        return list
    }
}
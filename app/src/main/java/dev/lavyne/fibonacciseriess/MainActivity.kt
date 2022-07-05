package dev.lavyne.fibonacciseriess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.lavyne.fibonacciseriess.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        views()

    }
    fun views(){
//        var numberList=displayNumbers(100)
        var numberList=generate100Fibbonaci()
        binding.rvNumbers.layoutManager= LinearLayoutManager(this)
        binding.rvNumbers.adapter=RecyclerViewNumberAdapter(numberList)

    }
//    fun displayNumbers(size:Int): List<Int> {
//        val list=ArrayList<Int>(0,1)
//        var first=0
//        var second=1
//        var sum=0
//        while (sum <= size){
//            print("$first")
//            val next=first+second
//            first=second
//            second=next
//            sum++
//            list+=next
//        }
//        return list
//    }
    fun generate100Fibbonaci() :MutableList<BigInteger>{
      var fiblist: MutableList<BigInteger> = mutableListOf(BigInteger.ZERO,BigInteger.ONE)
    while (fiblist.size<100){
        var last = fiblist.get(fiblist.lastIndex)
        var secondLast =fiblist.get(fiblist.lastIndex -1)
        var next=last+secondLast
        fiblist.add(next)
    }
    return fiblist
    }
}
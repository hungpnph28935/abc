package hungpnph28935.fptpolytechnic.viewbingdinhdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hungpnph28935.fptpolytechnic.viewbingdinhdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv1.text="text đã thay đổi"
        binding.button.setOnClickListener{
            Toast.makeText(this@MainActivity,"layout 1",Toast.LENGTH_LONG).show()
        }
        binding.button.setOnClickListener {
       //  val Intent=Intent(this@MainActivity,MainActivity2.class)
        }
    }
}
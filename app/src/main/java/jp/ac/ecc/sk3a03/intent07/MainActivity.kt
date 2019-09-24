package jp.ac.ecc.sk3a03.intent07

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** ボタン（button1）を押した時に呼び出される処理を追加する */
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener{

            // Hello01クラスを呼び出すIntentを生成
            val intent = Intent(this, Hello01::class.java)

            // Intent呼び出しを実行する
            startActivity(intent)


        }

    }
}

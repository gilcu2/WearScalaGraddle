package com.gilcu2.wearscala

/**
  * Created by reynaldo on 20/04/2016.
  */

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.{Button, TextView}

class MainActivityScala extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val hellow_text = findViewById(R.id.hellow_text).asInstanceOf[TextView]
    val refresh_button = findViewById(R.id.refresh_button).asInstanceOf[Button]
    refresh_button.setOnClickListener(new View.OnClickListener() {
      def onClick(v: View) = {
        hellow_text.append("+")
      }
    })
  }
}

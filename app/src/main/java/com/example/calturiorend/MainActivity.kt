package com.example.calturiorend


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var result = "0"
        var tempRes = result
        var current: String = ""
        val res: TextView = findViewById(R.id.result)
        res.text = result

        val num0: Button = findViewById(R.id.khong);
        val num1: Button = findViewById(R.id.mot);
        val num2: Button = findViewById(R.id.hai);
        val num3: Button = findViewById(R.id.ba);
        val num4: Button = findViewById(R.id.bon);
        val num5: Button = findViewById(R.id.nam);
        val num6: Button = findViewById(R.id.sau);
        val num7: Button = findViewById(R.id.bay);
        val num8: Button = findViewById(R.id.tam);
        val num9: Button = findViewById(R.id.chin);


        num0.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "0"
                res.text = result
            }
        }
        num1.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result == "0") {
                result = "1"
                res.text = result
            } else {
                result = "1"
                res.text = result
            }
        }
        num2.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "2"
                res.text = result
            } else {
                result = "2"
                res.text = result
            }
        }
        num3.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "3"
                res.text = result
            } else {
                result = "3"
                res.text = result
            }
        }
        num4.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "4"
                res.text = result
            } else {
                result = "4"
                res.text = result
            }
        }
        num5.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "5"
                res.text = result
            } else {
                result = "5"
                res.text = result
            }
        }
        num6.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "6"
                res.text = result
            } else {
                result = "6"
                res.text = result
            }
        }
        num7.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "7"
                res.text = result
            } else {
                result = "7"
                res.text = result
            }
        }
        num8.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "8"
                res.text = result
            } else {
                result = "8"
                res.text = result
            }
        }
        num9.setOnClickListener {
            if (result.length == 8) return@setOnClickListener
            if (result != "0") {
                result += "9"
                res.text = result
            } else {
                result = "9"
                res.text = result
            }
        }


        val plus: Button = findViewById(R.id.cong)
        val minus: Button = findViewById(R.id.tru)
        val multiply: Button = findViewById(R.id.nhan)
        val divide: Button = findViewById(R.id.chia)

        plus.setOnClickListener {
            if (current != "") {
                plusValue(BigInteger(tempRes), BigInteger(result))
            }
            current = "plus";
            tempRes = result;
            result = ""
            res.text = result

        }

        minus.setOnClickListener {
            if (current != "") {
                minusValue(BigInteger(tempRes), BigInteger(result))
            }
            current = "minus";
            tempRes = result;
            result = ""
            res.text = result
        }

        multiply.setOnClickListener {
            if (current != "") {
                multiplyValue(BigInteger(tempRes), BigInteger(result))
            }
            current = "multiply";
            tempRes = result;
            result = ""
            res.text = result
        }

        divide.setOnClickListener {
            if (current != "") {
                divideValue(BigInteger(tempRes), BigInteger(result))
            }
            current = "divide";
            tempRes = result;
            result = ""
            res.text = result
        }

        val equal: Button = findViewById(R.id.bang);

        equal.setOnClickListener {
            when (current) {
                "plus" -> {
                    val r = plusValue(BigInteger(tempRes), BigInteger(result))
                    current = ""
                    result = "0"
                    tempRes = "0"
                    res.text = r.toString(10)
                }
                "minus" -> {
                    val r = minusValue(BigInteger(tempRes), BigInteger(result))
                    current = ""
                    result = "0"
                    tempRes = "0"
                    res.text = r.toString(10)
                }
                "multiply" -> {
                    val r = multiplyValue(BigInteger(tempRes), BigInteger(result))
                    current = ""
                    result = "0"
                    tempRes = "0"
                    res.text = r.toString(10)
                }
                "divide" -> {
                    val r = divideValue(BigInteger(tempRes), BigInteger(result))
                    current = ""
                    result = "0"
                    tempRes = "0"
                    res.text = r.toString(10)
                }

            }
        }

        val clear: Button = findViewById(R.id.ce)

        clear.setOnClickListener {
            current = ""
            result = "0"
            tempRes = "0"
            res.text = result
        }
    }

    fun plusValue(a: BigInteger, b: BigInteger): BigInteger {
        return a + b
    }

    fun minusValue(a: BigInteger, b: BigInteger): BigInteger {
        return a - b
    }

    fun multiplyValue(a: BigInteger, b: BigInteger): BigInteger {
        return a * b
    }

    fun divideValue(a: BigInteger, b: BigInteger): BigInteger {
        return a / b
    }


}
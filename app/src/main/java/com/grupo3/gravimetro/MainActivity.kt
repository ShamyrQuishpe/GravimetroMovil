package com.grupo3.gravimetro

import android.Manifest
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.location.Location
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class MainActivity : AppCompatActivity(), SensorEventListener {
    // Variables para el sensor de gravedad
    private lateinit var sensorManager: SensorManager
    private var gravitySensor: Sensor? = null
    private lateinit var tvX: TextView
    private lateinit var tvY: TextView
    private lateinit var tvZ: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialización del sensor de gravedad
        tvX = findViewById(R.id.tv_x)
        tvY = findViewById(R.id.tv_y)
        tvZ = findViewById(R.id.tv_z)
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        gravitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY)
        if (gravitySensor == null) {
            tvX.text = "Sensor de gravedad no disponible"
        }

    }
    // Métodos para el sensor de gravedad
    override fun onResume() {
        super.onResume()
        gravitySensor?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event?.sensor?.type == Sensor.TYPE_GRAVITY) {
            val x = event.values[0]
            val y = event.values[1]
            val z = event.values[2]
            tvX.text = "X: $x"
            tvY.text = "Y: $y"
            tvZ.text = "Z: $z"
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}

}
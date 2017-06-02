package com.agilie.controller.animation.painter

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PointF
import com.agilie.controller.pointInCircle

class MovableCircleImpl(val paint: Paint) : MovableCircle {

    var center = PointF()
    var radius = 0f

    override fun onDraw(canvas: Canvas) {
        canvas.drawCircle(center.x, center.y, radius, paint)
    }

    override fun onSizeChanged(w: Int, h: Int) {
    }

    override fun onActionDown(pointF: PointF) {
        if (!pointInCircle(pointF, center, radius * 2))
            return
        // TODO start light show
    }

    override fun onActionMove(point: PointF) {
        //val alfa = calculateAngleWithTwoVectors(touchPointF, pointF)

        //val point = getPointOnBorderLineOfCircle(mainCenter, eventRadius, angle)
        center.apply {
            x = point.x
            y = point.y
        }
    }

    override fun onActionUp(pointF: PointF) {
    }

}
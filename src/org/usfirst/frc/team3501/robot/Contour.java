package org.usfirst.frc.team3501.robot;

import org.opencv.core.Point;

public class Contour {
  private Point[] points;
  private double[] xPoints;
  private double[] yPoints;

  public Contour(Point[] points) {
    this.points = points;
    xPoints = new double[points.length];
    yPoints = new double[points.length];
  }

  public void convertPointsToPoints() {
    for (int i = 0; i < points.length; i++) {
      xPoints[i] = points[i].x;
      yPoints[i] = points[i].y;
    }
  }

  public double getMinX() {
    double minX = Double.MAX_VALUE;
    for (double x : xPoints) {
      if (x < minX) {
        minX = x;
      }
    }
    return minX;
  }

  public double getMinY() {
    double minY = Double.MAX_VALUE;
    for (double y : yPoints) {
      if (y < minY) {
        minY = y;
      }
    }
    return minY;
  }

  public double getMaxX() {
    double maxX = Double.MIN_VALUE;
    for (double x : xPoints) {
      if (x > maxX) {
        maxX = x;
      }
    }
    return maxX;
  }

  public double getMaxY() {
    double maxY = Double.MIN_VALUE;
    for (double y : yPoints) {
      if (y > maxY) {
        maxY = y;
      }
    }
    return maxY;
  }

  public double getCenterX() {
    return (this.getMaxX() - this.getMinX() / 2.0);
  }

  public double getCenterY() {
    return (this.getMaxY() - this.getMinY() / 2.0);
  }

  public double[] getxPoints() {
    return xPoints;
  }

  public double[] getyPoints() {
    return yPoints;
  }

}

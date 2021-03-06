/**
 * Copyright (C) 2013-2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.datasets.lshtc4;

/**
 * @author timmolter
 */
public class LSHTC4 {

  private int id;
  private String labels;
  private String features;

  public int getId() {

    return id;
  }

  public void setId(int id) {

    this.id = id;
  }

  public String getLabels() {

    return labels;
  }

  public String[] getLabelsAsArray() {

    return labels.split(",");
  }

  public void setLabels(String labels) {

    this.labels = labels;
  }

  public String getFeatures() {

    return features;
  }

  public String[] getFeaturesAsArray() {

    return features.split(",");
  }

  public void setFeatures(String features) {

    this.features = features;
  }

  @Override
  public String toString() {

    return "LSHTC4 [id=" + id + ", labels=" + labels + ", features=" + features + "]";
  }

}

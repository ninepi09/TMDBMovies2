/*
 * The MIT License (MIT)
 *
 * Designed and developed by 2018 imobilenetid (Jaewoong Eum)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.imobilenetid.themovies.view.adapter

import android.view.View
import com.imobilenetid.baserecyclerviewadapter.BaseAdapter
import com.imobilenetid.baserecyclerviewadapter.SectionRow
import com.imobilenetid.themovies.R
import com.imobilenetid.themovies.models.Resource
import com.imobilenetid.themovies.models.Review
import com.imobilenetid.themovies.view.viewholder.ReviewListViewHolder
import com.imobilenetid.whatif.whatIfNotNull

class ReviewListAdapter : BaseAdapter() {

  init {
    addSection(ArrayList<Review>())
  }

  fun addReviewList(resource: Resource<List<Review>>) {
    resource.data.whatIfNotNull {
      sections()[0].addAll(it)
      notifyDataSetChanged()
    }
  }

  override fun layout(sectionRow: SectionRow) = R.layout.item_review

  override fun viewHolder(layout: Int, view: View) = ReviewListViewHolder(view)
}
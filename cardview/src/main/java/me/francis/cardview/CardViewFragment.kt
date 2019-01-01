package me.francis.cardview

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.annotation.VisibleForTesting
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar

class CardViewFragment : Fragment() {

    private val TAG = "CardViewFragment"
    @VisibleForTesting
    lateinit var cardView: CardView
    @VisibleForTesting
    lateinit var radiusSeekBar: SeekBar
    @VisibleForTesting
    lateinit var elevationSeekBar: SeekBar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_card_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView = view.findViewById(R.id.cardview)
        radiusSeekBar = view.findViewById(R.id.cardview_radius_seekbar)
        elevationSeekBar = view.findViewById(R.id.cardview_elevation_seekbar)

        radiusSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.d(TAG, "SeekBar Radius progress: $progress")
                cardView.radius = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) = Unit // do nothing

            override fun onStopTrackingTouch(seekBar: SeekBar?) = Unit // do nothing
        })

        elevationSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                Log.d(TAG, "SeekBar Elevation progress : $progress")
                cardView.elevation = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) = Unit // do nothing

            override fun onStopTrackingTouch(seekBar: SeekBar) = Unit // do nothing
        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CardViewFragment()
    }
}

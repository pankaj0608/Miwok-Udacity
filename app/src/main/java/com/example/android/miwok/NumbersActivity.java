package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);

//        // Create and setup the {@link AudioManager} to request audio focus
//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        final ArrayList<Word> words = new ArrayList<Word>();
//
//        words.add(new Word("One", "एक", R.drawable.number_one, R.raw.one));
//        words.add(new Word("Two", "दो", R.drawable.number_two, R.raw.two));
//        words.add(new Word("Three", "तीन", R.drawable.number_three, R.raw.three));
//        words.add(new Word("Four", "चार", R.drawable.number_four, R.raw.four));
//        words.add(new Word("Five", "पांच", R.drawable.number_five, R.raw.five));
//        words.add(new Word("Six", "छह", R.drawable.number_six, R.raw.six));
//        words.add(new Word("Seven", "सात", R.drawable.number_seven, R.raw.seven));
//        words.add(new Word("Eight", "आठ", R.drawable.number_eight, R.raw.eight));
//        words.add(new Word("Nine", "नौ", R.drawable.number_nine, R.raw.nine));
//        words.add(new Word("Ten", "दस", R.drawable.number_ten, R.raw.ten));
//
//
////        for(int i=0; i<0; i++) {
////            words.add(words.get(i%5));
////        }
//
//        System.out.println("I am in NumbersActivity " + words.size());
//
//        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        WordAdapter itemsAdapter =
//                new WordAdapter(this,
//                        R.layout.list_item, words, R.color.category_numbers, R.color.tan_background);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(itemsAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                TextView engTextView = (TextView) view.findViewById(R.id.engText);
//                System.out.println("---- " + engTextView.getText());
//
//                releaseMediaPlayer();
//
//                // Request audio focus so in order to play the audio file. The app needs to play a
//                // short audio file, so we will request audio focus with a short amount of time
//                // with AUDIOFOCUS_GAIN_TRANSIENT.
//                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
//                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    // We have audio focus now.
//                    mMediaPlayer = MediaPlayer.create(getApplicationContext(),
//                            words.get(position).getAudioResourceId());
//
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//
//                    mMediaPlayer.start();
//                }
//            }
//        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player
        // resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
//        System.out.println("In releaseMediaPlayer");
//
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//
//            // Regardless of whether or not we were granted audio focus, abandon it. This also
//            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//        }
    }

}

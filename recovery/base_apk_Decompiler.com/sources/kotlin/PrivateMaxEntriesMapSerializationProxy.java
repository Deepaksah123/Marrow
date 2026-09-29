package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.PrivateMaxEntriesMapNode;
import kotlin.PrivateMaxEntriesMapValueIterator;
import kotlin.ReflectionCache;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMapSerializationProxy extends menuHostHelperlambda0 {
    static final int AudioAttributesCompatParcelizer = (int) TimeUnit.SECONDS.toMillis(30);
    Context AudioAttributesImplApi21Parcelizer;
    MediaDescriptionCompat AudioAttributesImplApi26Parcelizer;
    AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    Bitmap IconCompatParcelizer;
    read MediaBrowserCompatCustomActionResultReceiver;
    Uri MediaBrowserCompatItemReceiver;
    RemoteActionCompatParcelizer MediaBrowserCompatMediaItem;
    final ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatSearchResultReceiver;
    private final write MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    final List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> MediaDescriptionCompat;
    final ExtensionsKtkotlinModule1 MediaMetadataCompat;
    MediaControllerCompat RatingCompat;
    Bitmap RemoteActionCompatParcelizer;
    int handleMediaPlayPauseIfPendingOnHandler;
    private IconCompatParcelizer onAddQueueItem;
    private boolean onCommand;
    private ImageView onCustomAction;
    private RelativeLayout onFastForward;
    private boolean onMediaButtonEvent;
    private long onPause;
    private final Handler onPlay;
    private ImageButton onPlayFromMediaId;
    private Button onPlayFromSearch;
    private TextView onPlayFromUri;
    private C0185kotlinModule onPrepare;
    private String onPrepareFromMediaId;
    private RecyclerView onPrepareFromSearch;
    private TextView onRemoveQueueItemAt;
    boolean read;
    int write;

    public PrivateMaxEntriesMapSerializationProxy(Context context) {
        this(context, (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PrivateMaxEntriesMapSerializationProxy(Context context, byte b) {
        Context contextWrite = getAccessible.write(context, 0, false);
        super(contextWrite, getAccessible.IconCompatParcelizer(contextWrite));
        this.onPrepare = C0185kotlinModule.read;
        this.MediaDescriptionCompat = new ArrayList();
        this.onPlay = new Handler() { // from class: o.PrivateMaxEntriesMapSerializationProxy.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                PrivateMaxEntriesMapSerializationProxy.this.read((List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver>) message.obj);
            }
        };
        Context context2 = getContext();
        this.AudioAttributesImplApi21Parcelizer = context2;
        this.MediaMetadataCompat = ExtensionsKtkotlinModule1.write(context2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new write();
        this.MediaBrowserCompatSearchResultReceiver = ExtensionsKtkotlinModule1.read();
        this.AudioAttributesImplBaseParcelizer = new AudioAttributesCompatParcelizer();
        write(ExtensionsKtkotlinModule1.RemoteActionCompatParcelizer());
    }

    private void write(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.RatingCompat;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            this.RatingCompat = null;
        }
        if (token == null || !this.onCommand) {
            return;
        }
        try {
            this.RatingCompat = new MediaControllerCompat(this.AudioAttributesImplApi21Parcelizer, token);
        } catch (RemoteException unused) {
        }
        MediaControllerCompat mediaControllerCompat2 = this.RatingCompat;
        if (mediaControllerCompat2 != null) {
            mediaControllerCompat2.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        }
        MediaControllerCompat mediaControllerCompat3 = this.RatingCompat;
        MediaMetadataCompat mediaMetadataCompatIconCompatParcelizer = mediaControllerCompat3 == null ? null : mediaControllerCompat3.IconCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = mediaMetadataCompatIconCompatParcelizer != null ? mediaMetadataCompatIconCompatParcelizer.write() : null;
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    public final void AudioAttributesCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.onPrepare.equals(c0185kotlinModule)) {
            return;
        }
        this.onPrepare = c0185kotlinModule;
        if (this.onCommand) {
            this.MediaMetadataCompat.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(c0185kotlinModule, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 1);
        }
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer(List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!read(list.get(size))) {
                list.remove(size);
            }
        }
    }

    private boolean read(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        return !mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() && mediaBrowserCompatCustomActionResultReceiver.onMediaButtonEvent() && mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.onPrepare);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_cast_dialog);
        ImageButton imageButton = (ImageButton) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_close_button);
        this.onPlayFromMediaId = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapSerializationProxy.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivateMaxEntriesMapSerializationProxy.this.dismiss();
            }
        });
        Button button = (Button) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_stop_button);
        this.onPlayFromSearch = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapSerializationProxy.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver.onFastForward()) {
                    ExtensionsKtkotlinModule1 extensionsKtkotlinModule1 = PrivateMaxEntriesMapSerializationProxy.this.MediaMetadataCompat;
                    ExtensionsKtkotlinModule1.write(2);
                }
                PrivateMaxEntriesMapSerializationProxy.this.dismiss();
            }
        });
        this.onAddQueueItem = new IconCompatParcelizer();
        RecyclerView recyclerView = (RecyclerView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_list);
        this.onPrepareFromSearch = recyclerView;
        recyclerView.setAdapter(this.onAddQueueItem);
        this.onPrepareFromSearch.setLayoutManager(new LinearLayoutManager());
        this.MediaBrowserCompatMediaItem = new RemoteActionCompatParcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler = getAccessible.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 0);
        this.onFastForward = (RelativeLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_meta);
        this.onCustomAction = (ImageView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_meta_art);
        this.onRemoveQueueItemAt = (TextView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_meta_title);
        this.onPlayFromUri = (TextView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_meta_subtitle);
        this.onPrepareFromMediaId = this.AudioAttributesImplApi21Parcelizer.getResources().getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_cast_dialog_title_view_placeholder);
        this.onMediaButtonEvent = true;
        MediaBrowserCompatItemReceiver();
    }

    final void MediaBrowserCompatItemReceiver() {
        getWindow().setLayout(-1, -1);
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onCommand = true;
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(this.onPrepare, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 1);
        IconCompatParcelizer();
        write(ExtensionsKtkotlinModule1.RemoteActionCompatParcelizer());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onCommand = false;
        this.MediaMetadataCompat.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.onPlay.removeMessages(1);
        write((MediaSessionCompat.Token) null);
    }

    final void AudioAttributesImplApi21Parcelizer() {
        if (!this.MediaBrowserCompatSearchResultReceiver.onFastForward() || this.MediaBrowserCompatSearchResultReceiver.handleMediaPlayPauseIfPendingOnHandler()) {
            dismiss();
            return;
        }
        if (this.onMediaButtonEvent) {
            if (this.read) {
                if (RemoteActionCompatParcelizer(this.IconCompatParcelizer)) {
                    this.onCustomAction.setVisibility(8);
                    Objects.toString(this.IconCompatParcelizer);
                } else {
                    this.onCustomAction.setVisibility(0);
                    this.onCustomAction.setImageBitmap(this.IconCompatParcelizer);
                    this.onCustomAction.setBackgroundColor(this.write);
                    this.onFastForward.setBackgroundDrawable(new BitmapDrawable(this.IconCompatParcelizer));
                }
                write();
            } else {
                this.onCustomAction.setVisibility(8);
            }
            AudioAttributesImplApi26Parcelizer();
        }
    }

    static boolean RemoteActionCompatParcelizer(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    final int RemoteActionCompatParcelizer() {
        return this.onCustomAction.getHeight();
    }

    final void MediaBrowserCompatCustomActionResultReceiver() {
        if (AudioAttributesImplBaseParcelizer()) {
            read readVar = this.MediaBrowserCompatCustomActionResultReceiver;
            if (readVar != null) {
                readVar.cancel(true);
            }
            read readVar2 = new read();
            this.MediaBrowserCompatCustomActionResultReceiver = readVar2;
            readVar2.execute(new Void[0]);
        }
    }

    final void write() {
        this.read = false;
        this.IconCompatParcelizer = null;
        this.write = 0;
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        MediaDescriptionCompat mediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer;
        Bitmap bitmapWrite = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.write();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.AudioAttributesImplApi26Parcelizer;
        Uri uriRemoteActionCompatParcelizer = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.RemoteActionCompatParcelizer() : null;
        read readVar = this.MediaBrowserCompatCustomActionResultReceiver;
        Bitmap bitmap = readVar == null ? this.RemoteActionCompatParcelizer : readVar.read();
        read readVar2 = this.MediaBrowserCompatCustomActionResultReceiver;
        Uri uriIconCompatParcelizer = readVar2 == null ? this.MediaBrowserCompatItemReceiver : readVar2.IconCompatParcelizer();
        if (bitmap != bitmapWrite) {
            return true;
        }
        return bitmap == null && configureFromStringCreator.RemoteActionCompatParcelizer(uriIconCompatParcelizer, uriRemoteActionCompatParcelizer);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        MediaDescriptionCompat mediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer;
        CharSequence charSequenceMediaBrowserCompatItemReceiver = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.MediaBrowserCompatItemReceiver();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceMediaBrowserCompatItemReceiver);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.AudioAttributesImplApi26Parcelizer;
        CharSequence charSequenceMediaBrowserCompatCustomActionResultReceiver = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.MediaBrowserCompatCustomActionResultReceiver() : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceMediaBrowserCompatCustomActionResultReceiver);
        if (!zIsEmpty) {
            this.onRemoveQueueItemAt.setText(charSequenceMediaBrowserCompatItemReceiver);
        } else {
            this.onRemoveQueueItemAt.setText(this.onPrepareFromMediaId);
        }
        if (!zIsEmpty2) {
            this.onPlayFromUri.setText(charSequenceMediaBrowserCompatCustomActionResultReceiver);
            this.onPlayFromUri.setVisibility(0);
        } else {
            this.onPlayFromUri.setVisibility(8);
        }
    }

    class RemoteActionCompatParcelizer implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        RemoteActionCompatParcelizer() {
        }
    }

    public final void IconCompatParcelizer() {
        if (this.onCommand) {
            ArrayList arrayList = new ArrayList(ExtensionsKtkotlinModule1.AudioAttributesCompatParcelizer());
            IconCompatParcelizer(arrayList);
            Collections.sort(arrayList, PrivateMaxEntriesMapValueIterator.RemoteActionCompatParcelizer.IconCompatParcelizer);
            if (SystemClock.uptimeMillis() - this.onPause >= 300) {
                read(arrayList);
                return;
            }
            this.onPlay.removeMessages(1);
            Handler handler = this.onPlay;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.onPause + 300);
        }
    }

    final void read(List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
        this.onPause = SystemClock.uptimeMillis();
        this.MediaDescriptionCompat.clear();
        this.MediaDescriptionCompat.addAll(list);
        this.onAddQueueItem.write();
    }

    final class IconCompatParcelizer extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {
        private final LayoutInflater AudioAttributesCompatParcelizer;
        private final Drawable AudioAttributesImplApi26Parcelizer;
        private final Drawable AudioAttributesImplBaseParcelizer;
        private final Drawable MediaBrowserCompatItemReceiver;
        private final Drawable read;
        private final ArrayList<RemoteActionCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        private final ArrayList<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> write = new ArrayList<>();
        private final ArrayList<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> RemoteActionCompatParcelizer = new ArrayList<>();

        IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = LayoutInflater.from(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer);
            this.read = getAccessible.RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplBaseParcelizer = getAccessible.AudioAttributesImplBaseParcelizer(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer);
            this.MediaBrowserCompatItemReceiver = getAccessible.MediaBrowserCompatItemReceiver(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi26Parcelizer = getAccessible.AudioAttributesImplApi26Parcelizer(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer);
            write();
        }

        final boolean IconCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            if (mediaBrowserCompatCustomActionResultReceiver.onFastForward()) {
                return true;
            }
            if (!(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer)) {
                return false;
            }
            Iterator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> it = ((ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver).AudioAttributesCompatParcelizer().iterator();
            while (it.hasNext()) {
                if (it.next().MediaBrowserCompatCustomActionResultReceiver().equals(mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver())) {
                    return true;
                }
            }
            return false;
        }

        final void write() {
            this.MediaBrowserCompatCustomActionResultReceiver.clear();
            if (PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
                this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver, 1));
                Iterator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> it = ((ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver).AudioAttributesCompatParcelizer().iterator();
                while (it.hasNext()) {
                    this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(it.next(), 3));
                }
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver, 3));
            }
            this.write.clear();
            this.RemoteActionCompatParcelizer.clear();
            for (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver : PrivateMaxEntriesMapSerializationProxy.this.MediaDescriptionCompat) {
                if (!IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver)) {
                    if (mediaBrowserCompatCustomActionResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
                        this.RemoteActionCompatParcelizer.add(mediaBrowserCompatCustomActionResultReceiver);
                    } else {
                        this.write.add(mediaBrowserCompatCustomActionResultReceiver);
                    }
                }
            }
            if (this.write.size() > 0) {
                this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer.getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_dialog_device_header), 2));
                Iterator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> it2 = this.write.iterator();
                while (it2.hasNext()) {
                    this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(it2.next(), 3));
                }
            }
            if (this.RemoteActionCompatParcelizer.size() > 0) {
                this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer.getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_dialog_route_header), 2));
                Iterator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> it3 = this.RemoteActionCompatParcelizer.iterator();
                while (it3.hasNext()) {
                    this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(it3.next(), 4));
                }
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new write(this.AudioAttributesCompatParcelizer.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new C0040IconCompatParcelizer(this.AudioAttributesCompatParcelizer.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_dialog_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_cast_route_item, viewGroup, false));
            }
            if (i != 4) {
                return null;
            }
            return new read(this.AudioAttributesCompatParcelizer.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_cast_group_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
            int itemViewType = getItemViewType(i);
            RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i);
            if (itemViewType == 1) {
                ((write) onmediabuttonevent).read(RemoteActionCompatParcelizer2);
                return;
            }
            if (itemViewType == 2) {
                ((C0040IconCompatParcelizer) onmediabuttonevent).write(RemoteActionCompatParcelizer2);
            } else if (itemViewType == 3) {
                ((AudioAttributesCompatParcelizer) onmediabuttonevent).write(RemoteActionCompatParcelizer2);
            } else {
                if (itemViewType != 4) {
                    return;
                }
                ((read) onmediabuttonevent).write(RemoteActionCompatParcelizer2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemCount() {
            return this.MediaBrowserCompatCustomActionResultReceiver.size();
        }

        final Drawable read(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            Uri uriMediaBrowserCompatItemReceiver = mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
            if (uriMediaBrowserCompatItemReceiver != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer.getContentResolver().openInputStream(uriMediaBrowserCompatItemReceiver), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    Objects.toString(uriMediaBrowserCompatItemReceiver);
                }
            }
            return write(mediaBrowserCompatCustomActionResultReceiver);
        }

        private Drawable write(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            int iAudioAttributesImplApi26Parcelizer = mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplApi26Parcelizer == 1) {
                return this.AudioAttributesImplBaseParcelizer;
            }
            if (iAudioAttributesImplApi26Parcelizer == 2) {
                return this.MediaBrowserCompatItemReceiver;
            }
            if (mediaBrowserCompatCustomActionResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
                return this.AudioAttributesImplApi26Parcelizer;
            }
            return this.read;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemViewType(int i) {
            return this.MediaBrowserCompatCustomActionResultReceiver.get(i).AudioAttributesCompatParcelizer();
        }

        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            return this.MediaBrowserCompatCustomActionResultReceiver.get(i);
        }

        class RemoteActionCompatParcelizer {
            private final Object IconCompatParcelizer;
            private final int write;

            RemoteActionCompatParcelizer(Object obj, int i) {
                this.IconCompatParcelizer = obj;
                this.write = i;
            }

            public final Object read() {
                return this.IconCompatParcelizer;
            }

            public final int AudioAttributesCompatParcelizer() {
                return this.write;
            }
        }

        class write extends RecyclerView.onMediaButtonEvent {
            private TextView RemoteActionCompatParcelizer;
            private MediaRouteVolumeSlider read;

            write(View view) {
                super(view);
                this.RemoteActionCompatParcelizer = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_group_volume_route_name);
                this.read = (MediaRouteVolumeSlider) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_group_volume_slider);
            }

            public final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) remoteActionCompatParcelizer.read();
                this.RemoteActionCompatParcelizer.setText(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer().toUpperCase());
                this.read.setColor(PrivateMaxEntriesMapSerializationProxy.this.handleMediaPlayPauseIfPendingOnHandler);
                this.read.setTag(mediaBrowserCompatCustomActionResultReceiver);
                this.read.setProgress(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat());
                this.read.setOnSeekBarChangeListener(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatMediaItem);
            }
        }

        /* JADX INFO: renamed from: o.PrivateMaxEntriesMapSerializationProxy$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        class C0040IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
            private TextView write;

            C0040IconCompatParcelizer(View view) {
                super(view);
                this.write = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_dialog_header_name);
            }

            public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                this.write.setText(remoteActionCompatParcelizer.read().toString().toUpperCase());
            }
        }

        class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
            private MediaRouteVolumeSlider IconCompatParcelizer;
            private CheckBox RemoteActionCompatParcelizer;
            private ImageView read;
            private TextView write;

            AudioAttributesCompatParcelizer(View view) {
                super(view);
                this.read = (ImageView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_route_icon);
                this.write = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_route_name);
                this.RemoteActionCompatParcelizer = (CheckBox) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_checkbox);
                this.IconCompatParcelizer = (MediaRouteVolumeSlider) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_volume_slider);
            }

            public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) remoteActionCompatParcelizer.read();
                this.read.setImageDrawable(IconCompatParcelizer.this.read(mediaBrowserCompatCustomActionResultReceiver));
                this.write.setText(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer());
                this.RemoteActionCompatParcelizer.setChecked(IconCompatParcelizer.this.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver));
                this.IconCompatParcelizer.setColor(PrivateMaxEntriesMapSerializationProxy.this.handleMediaPlayPauseIfPendingOnHandler);
                this.IconCompatParcelizer.setTag(mediaBrowserCompatCustomActionResultReceiver);
                this.IconCompatParcelizer.setProgress(mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat());
                this.IconCompatParcelizer.setOnSeekBarChangeListener(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatMediaItem);
            }
        }

        class read extends RecyclerView.onMediaButtonEvent {
            private TextView AudioAttributesCompatParcelizer;
            private ImageView write;

            read(View view) {
                super(view);
                this.write = (ImageView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_group_icon);
                this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_cast_group_name);
            }

            public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) remoteActionCompatParcelizer.read();
                this.write.setImageDrawable(IconCompatParcelizer.this.read(mediaBrowserCompatCustomActionResultReceiver));
                this.AudioAttributesCompatParcelizer.setText(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer());
            }
        }
    }

    final class write extends ExtensionsKtkotlinModule1.IconCompatParcelizer {
        write() {
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void read() {
            PrivateMaxEntriesMapSerializationProxy.this.IconCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatItemReceiver() {
            PrivateMaxEntriesMapSerializationProxy.this.IconCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesImplBaseParcelizer() {
            PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            PrivateMaxEntriesMapSerializationProxy.this.IconCompatParcelizer();
            PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer();
        }
    }

    final class AudioAttributesCompatParcelizer extends MediaControllerCompat.RemoteActionCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer
        public final void write() {
            if (PrivateMaxEntriesMapSerializationProxy.this.RatingCompat != null) {
                PrivateMaxEntriesMapSerializationProxy.this.RatingCompat.IconCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplBaseParcelizer);
                PrivateMaxEntriesMapSerializationProxy.this.RatingCompat = null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer
        public final void write(MediaMetadataCompat mediaMetadataCompat) {
            PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi26Parcelizer = mediaMetadataCompat == null ? null : mediaMetadataCompat.write();
            PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatCustomActionResultReceiver();
            PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer();
        }
    }

    class read extends AsyncTask<Void, Void, Bitmap> {
        private int AudioAttributesCompatParcelizer;
        private final Uri IconCompatParcelizer;
        private final Bitmap read;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
            return write();
        }

        read() {
            Bitmap bitmapWrite = PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi26Parcelizer == null ? null : PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi26Parcelizer.write();
            this.read = PrivateMaxEntriesMapSerializationProxy.RemoteActionCompatParcelizer(bitmapWrite) ? null : bitmapWrite;
            this.IconCompatParcelizer = PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi26Parcelizer != null ? PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() : null;
        }

        public final Bitmap read() {
            return this.read;
        }

        public final Uri IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            PrivateMaxEntriesMapSerializationProxy.this.write();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.InputStream] */
        private Bitmap write() throws Throwable {
            InputStream inputStream;
            Bitmap bitmap = this.read;
            ?? r1 = 0;
            if (bitmap == null) {
                Uri uri = this.IconCompatParcelizer;
                try {
                    if (uri != null) {
                        try {
                            inputStream = read(uri);
                            try {
                                if (inputStream == null) {
                                    Objects.toString(this.IconCompatParcelizer);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStream, null, options);
                                if (options.outWidth == 0 || options.outHeight == 0) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    return null;
                                }
                                try {
                                    inputStream.reset();
                                } catch (IOException unused3) {
                                    inputStream.close();
                                    inputStream = read(this.IconCompatParcelizer);
                                    if (inputStream == null) {
                                        Objects.toString(this.IconCompatParcelizer);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                PrivateMaxEntriesMapSerializationProxy privateMaxEntriesMapSerializationProxy = PrivateMaxEntriesMapSerializationProxy.this;
                                int i = options.outWidth;
                                int i2 = options.outHeight;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / privateMaxEntriesMapSerializationProxy.RemoteActionCompatParcelizer()));
                                if (isCancelled()) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    return null;
                                }
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                bitmap = bitmapDecodeStream;
                            } catch (IOException unused7) {
                                Objects.toString(this.IconCompatParcelizer);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                bitmap = null;
                            }
                        } catch (IOException unused9) {
                            inputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException unused10) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        bitmap = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r1 = uri;
                }
            }
            if (PrivateMaxEntriesMapSerializationProxy.RemoteActionCompatParcelizer(bitmap)) {
                Objects.toString(bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                ReflectionCache reflectionCache = new ReflectionCache.write(bitmap).IconCompatParcelizer().read();
                this.AudioAttributesCompatParcelizer = reflectionCache.write().isEmpty() ? 0 : reflectionCache.write().get(0).AudioAttributesCompatParcelizer();
            }
            return bitmap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatCustomActionResultReceiver = null;
            if (configureFromStringCreator.RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.RemoteActionCompatParcelizer, this.read) && configureFromStringCreator.RemoteActionCompatParcelizer(PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer)) {
                return;
            }
            PrivateMaxEntriesMapSerializationProxy.this.RemoteActionCompatParcelizer = this.read;
            PrivateMaxEntriesMapSerializationProxy.this.IconCompatParcelizer = bitmap;
            PrivateMaxEntriesMapSerializationProxy.this.MediaBrowserCompatItemReceiver = this.IconCompatParcelizer;
            PrivateMaxEntriesMapSerializationProxy.this.write = this.AudioAttributesCompatParcelizer;
            PrivateMaxEntriesMapSerializationProxy.this.read = true;
            PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer();
        }

        private InputStream read(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStreamOpenInputStream = PrivateMaxEntriesMapSerializationProxy.this.AudioAttributesImplApi21Parcelizer.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(new URL(uri.toString()).openConnection());
                uRLConnection.setConnectTimeout(PrivateMaxEntriesMapSerializationProxy.AudioAttributesCompatParcelizer);
                uRLConnection.setReadTimeout(PrivateMaxEntriesMapSerializationProxy.AudioAttributesCompatParcelizer);
                inputStreamOpenInputStream = uRLConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }
    }
}

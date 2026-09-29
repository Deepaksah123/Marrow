package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.PrivateMaxEntriesMapNode;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMapWeightedValue extends menuHostHelperlambda0 {
    private final IconCompatParcelizer AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private final ExtensionsKtkotlinModule1 AudioAttributesImplApi26Parcelizer;
    private ImageButton AudioAttributesImplBaseParcelizer;
    private write IconCompatParcelizer;
    private final Handler MediaBrowserCompatCustomActionResultReceiver;
    private RecyclerView MediaBrowserCompatItemReceiver;
    private C0185kotlinModule MediaDescriptionCompat;
    private long MediaMetadataCompat;
    List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> RemoteActionCompatParcelizer;
    private boolean read;
    Context write;

    public PrivateMaxEntriesMapWeightedValue(Context context) {
        this(context, (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PrivateMaxEntriesMapWeightedValue(Context context, byte b) {
        Context contextWrite = getAccessible.write(context, 0, false);
        super(contextWrite, getAccessible.IconCompatParcelizer(contextWrite));
        this.MediaDescriptionCompat = C0185kotlinModule.read;
        this.MediaBrowserCompatCustomActionResultReceiver = new Handler() { // from class: o.PrivateMaxEntriesMapWeightedValue.4
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                PrivateMaxEntriesMapWeightedValue.this.IconCompatParcelizer((List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver>) message.obj);
            }
        };
        Context context2 = getContext();
        this.AudioAttributesImplApi26Parcelizer = ExtensionsKtkotlinModule1.write(context2);
        this.AudioAttributesCompatParcelizer = new IconCompatParcelizer();
        this.write = context2;
        this.MediaMetadataCompat = context2.getResources().getInteger(PrivateMaxEntriesMapNode.write.mr_update_routes_delay_ms);
    }

    public final void AudioAttributesCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.MediaDescriptionCompat.equals(c0185kotlinModule)) {
            return;
        }
        this.MediaDescriptionCompat = c0185kotlinModule;
        if (this.read) {
            this.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(c0185kotlinModule, this.AudioAttributesCompatParcelizer, 1);
        }
        IconCompatParcelizer();
    }

    private void AudioAttributesCompatParcelizer(List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!RemoteActionCompatParcelizer(list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    private boolean RemoteActionCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        return !mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() && mediaBrowserCompatCustomActionResultReceiver.onMediaButtonEvent() && mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaDescriptionCompat);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_picker_dialog);
        this.RemoteActionCompatParcelizer = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_picker_close_button);
        this.AudioAttributesImplBaseParcelizer = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapWeightedValue.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivateMaxEntriesMapWeightedValue.this.dismiss();
            }
        });
        this.IconCompatParcelizer = new write();
        RecyclerView recyclerView = (RecyclerView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_picker_list);
        this.MediaBrowserCompatItemReceiver = recyclerView;
        recyclerView.setAdapter(this.IconCompatParcelizer);
        this.MediaBrowserCompatItemReceiver.setLayoutManager(new LinearLayoutManager());
        RemoteActionCompatParcelizer();
    }

    final void RemoteActionCompatParcelizer() {
        getWindow().setLayout(-1, -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.read = true;
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, this.AudioAttributesCompatParcelizer, 1);
        IconCompatParcelizer();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.read = false;
        this.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver.removeMessages(1);
    }

    public final void IconCompatParcelizer() {
        if (this.read) {
            ArrayList arrayList = new ArrayList(ExtensionsKtkotlinModule1.AudioAttributesCompatParcelizer());
            AudioAttributesCompatParcelizer(arrayList);
            Collections.sort(arrayList, AudioAttributesCompatParcelizer.read);
            if (SystemClock.uptimeMillis() - this.AudioAttributesImplApi21Parcelizer >= this.MediaMetadataCompat) {
                IconCompatParcelizer(arrayList);
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver.removeMessages(1);
            Handler handler = this.MediaBrowserCompatCustomActionResultReceiver;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.AudioAttributesImplApi21Parcelizer + this.MediaMetadataCompat);
        }
    }

    final void IconCompatParcelizer(List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
        this.AudioAttributesImplApi21Parcelizer = SystemClock.uptimeMillis();
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.addAll(list);
        this.IconCompatParcelizer.read();
    }

    final class IconCompatParcelizer extends ExtensionsKtkotlinModule1.IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void read() {
            PrivateMaxEntriesMapWeightedValue.this.IconCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatItemReceiver() {
            PrivateMaxEntriesMapWeightedValue.this.IconCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            PrivateMaxEntriesMapWeightedValue.this.IconCompatParcelizer();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            PrivateMaxEntriesMapWeightedValue.this.dismiss();
        }
    }

    static final class AudioAttributesCompatParcelizer implements Comparator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

        AudioAttributesCompatParcelizer() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2) {
            return IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver2);
        }

        private static int IconCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2) {
            return mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer().compareToIgnoreCase(mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesImplBaseParcelizer());
        }
    }

    final class write extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {
        private final Drawable AudioAttributesImplApi21Parcelizer;
        private final Drawable AudioAttributesImplApi26Parcelizer;
        private ArrayList<IconCompatParcelizer> IconCompatParcelizer;
        private final Drawable RemoteActionCompatParcelizer;
        private final LayoutInflater read;
        private final Drawable write;

        write() {
            this.read = LayoutInflater.from(PrivateMaxEntriesMapWeightedValue.this.write);
            this.RemoteActionCompatParcelizer = getAccessible.RemoteActionCompatParcelizer(PrivateMaxEntriesMapWeightedValue.this.write);
            this.AudioAttributesImplApi21Parcelizer = getAccessible.AudioAttributesImplBaseParcelizer(PrivateMaxEntriesMapWeightedValue.this.write);
            this.AudioAttributesImplApi26Parcelizer = getAccessible.MediaBrowserCompatItemReceiver(PrivateMaxEntriesMapWeightedValue.this.write);
            this.write = getAccessible.AudioAttributesImplApi26Parcelizer(PrivateMaxEntriesMapWeightedValue.this.write);
            read();
        }

        final void read() {
            this.IconCompatParcelizer = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (int size = PrivateMaxEntriesMapWeightedValue.this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = PrivateMaxEntriesMapWeightedValue.this.RemoteActionCompatParcelizer.get(size);
                if (mediaBrowserCompatCustomActionResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
                    arrayList.add(mediaBrowserCompatCustomActionResultReceiver);
                    PrivateMaxEntriesMapWeightedValue.this.RemoteActionCompatParcelizer.remove(size);
                }
            }
            this.IconCompatParcelizer.add(new IconCompatParcelizer(PrivateMaxEntriesMapWeightedValue.this.write.getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_dialog_device_header)));
            Iterator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> it = PrivateMaxEntriesMapWeightedValue.this.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                this.IconCompatParcelizer.add(new IconCompatParcelizer(it.next()));
            }
            this.IconCompatParcelizer.add(new IconCompatParcelizer(PrivateMaxEntriesMapWeightedValue.this.write.getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_dialog_route_header)));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.IconCompatParcelizer.add(new IconCompatParcelizer((ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) it2.next()));
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new C0041write(this.read.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_dialog_header_item, viewGroup, false));
            }
            if (i != 2) {
                return null;
            }
            return new AudioAttributesCompatParcelizer(this.read.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_picker_route_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
            int itemViewType = getItemViewType(i);
            IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            if (itemViewType == 1) {
                ((C0041write) onmediabuttonevent).IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer);
            } else {
                if (itemViewType != 2) {
                    return;
                }
                ((AudioAttributesCompatParcelizer) onmediabuttonevent).write(iconCompatParcelizerAudioAttributesCompatParcelizer);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemCount() {
            return this.IconCompatParcelizer.size();
        }

        final Drawable IconCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            Uri uriMediaBrowserCompatItemReceiver = mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
            if (uriMediaBrowserCompatItemReceiver != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(PrivateMaxEntriesMapWeightedValue.this.write.getContentResolver().openInputStream(uriMediaBrowserCompatItemReceiver), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    Objects.toString(uriMediaBrowserCompatItemReceiver);
                }
            }
            return AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        }

        private Drawable AudioAttributesCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            int iAudioAttributesImplApi26Parcelizer = mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplApi26Parcelizer == 1) {
                return this.AudioAttributesImplApi21Parcelizer;
            }
            if (iAudioAttributesImplApi26Parcelizer == 2) {
                return this.AudioAttributesImplApi26Parcelizer;
            }
            if (mediaBrowserCompatCustomActionResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
                return this.write;
            }
            return this.RemoteActionCompatParcelizer;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemViewType(int i) {
            return this.IconCompatParcelizer.get(i).read();
        }

        private IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            return this.IconCompatParcelizer.get(i);
        }

        class IconCompatParcelizer {
            private final Object IconCompatParcelizer;
            private final int RemoteActionCompatParcelizer;

            IconCompatParcelizer(Object obj) {
                this.IconCompatParcelizer = obj;
                if (obj instanceof String) {
                    this.RemoteActionCompatParcelizer = 1;
                } else if (obj instanceof ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) {
                    this.RemoteActionCompatParcelizer = 2;
                } else {
                    this.RemoteActionCompatParcelizer = 0;
                }
            }

            public final Object AudioAttributesCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final int read() {
                return this.RemoteActionCompatParcelizer;
            }
        }

        /* JADX INFO: renamed from: o.PrivateMaxEntriesMapWeightedValue$write$write, reason: collision with other inner class name */
        class C0041write extends RecyclerView.onMediaButtonEvent {
            private TextView RemoteActionCompatParcelizer;

            C0041write(View view) {
                super(view);
                this.RemoteActionCompatParcelizer = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_dialog_header_name);
            }

            public final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
                this.RemoteActionCompatParcelizer.setText(iconCompatParcelizer.AudioAttributesCompatParcelizer().toString());
            }
        }

        class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
            private TextView AudioAttributesCompatParcelizer;
            private View RemoteActionCompatParcelizer;
            private ImageView write;

            AudioAttributesCompatParcelizer(View view) {
                super(view);
                this.RemoteActionCompatParcelizer = view;
                this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_picker_route_name);
                this.write = (ImageView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_picker_route_icon);
            }

            public final void write(IconCompatParcelizer iconCompatParcelizer) {
                final ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) iconCompatParcelizer.AudioAttributesCompatParcelizer();
                this.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapWeightedValue.write.AudioAttributesCompatParcelizer.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mediaBrowserCompatCustomActionResultReceiver.onPlayFromMediaId();
                    }
                });
                this.AudioAttributesCompatParcelizer.setText(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer());
                this.write.setImageDrawable(write.this.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver));
            }
        }
    }
}

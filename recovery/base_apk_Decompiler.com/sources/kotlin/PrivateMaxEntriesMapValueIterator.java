package kotlin;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.PrivateMaxEntriesMapNode;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMapValueIterator extends menuHostHelperlambda0 {
    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private C0185kotlinModule AudioAttributesImplApi21Parcelizer;
    private final ExtensionsKtkotlinModule1 AudioAttributesImplApi26Parcelizer;
    private ListView AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    private ArrayList<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> MediaBrowserCompatItemReceiver;
    private final IconCompatParcelizer RemoteActionCompatParcelizer;
    private final Handler read;
    private long write;

    public PrivateMaxEntriesMapValueIterator(Context context) {
        this(context, (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PrivateMaxEntriesMapValueIterator(Context context, byte b) {
        Context contextWrite = getAccessible.write(context, 0, false);
        super(contextWrite, getAccessible.IconCompatParcelizer(contextWrite));
        this.AudioAttributesImplApi21Parcelizer = C0185kotlinModule.read;
        this.read = new Handler() { // from class: o.PrivateMaxEntriesMapValueIterator.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                PrivateMaxEntriesMapValueIterator.this.IconCompatParcelizer((List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver>) message.obj);
            }
        };
        this.AudioAttributesImplApi26Parcelizer = ExtensionsKtkotlinModule1.write(getContext());
        this.RemoteActionCompatParcelizer = new IconCompatParcelizer();
    }

    public final void write(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.AudioAttributesImplApi21Parcelizer.equals(c0185kotlinModule)) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = c0185kotlinModule;
        if (this.IconCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.read(this.RemoteActionCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(c0185kotlinModule, this.RemoteActionCompatParcelizer, 1);
        }
        write();
    }

    private void write(List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!write(list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    private boolean write(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        return !mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() && mediaBrowserCompatCustomActionResultReceiver.onMediaButtonEvent() && mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.menuHostHelperlambda0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.MediaBrowserCompatCustomActionResultReceiver.setText(charSequence);
    }

    @Override // kotlin.menuHostHelperlambda0, android.app.Dialog
    public final void setTitle(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.setText(i);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_chooser_dialog);
        this.MediaBrowserCompatItemReceiver = new ArrayList<>();
        this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(getContext(), this.MediaBrowserCompatItemReceiver);
        ListView listView = (ListView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_chooser_list);
        this.AudioAttributesImplBaseParcelizer = listView;
        listView.setAdapter((ListAdapter) this.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer.setOnItemClickListener(this.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer.setEmptyView(findViewById(R.id.empty));
        this.MediaBrowserCompatCustomActionResultReceiver = (TextView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_chooser_title);
        RemoteActionCompatParcelizer();
    }

    final void RemoteActionCompatParcelizer() {
        getWindow().setLayout(ClosedRangeMixin.read(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.IconCompatParcelizer = true;
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, 1);
        write();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer.read(this.RemoteActionCompatParcelizer);
        this.read.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void write() {
        if (this.IconCompatParcelizer) {
            ArrayList arrayList = new ArrayList(ExtensionsKtkotlinModule1.AudioAttributesCompatParcelizer());
            write(arrayList);
            Collections.sort(arrayList, RemoteActionCompatParcelizer.IconCompatParcelizer);
            if (SystemClock.uptimeMillis() - this.write >= 300) {
                IconCompatParcelizer(arrayList);
                return;
            }
            this.read.removeMessages(1);
            Handler handler = this.read;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.write + 300);
        }
    }

    final void IconCompatParcelizer(List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
        this.write = SystemClock.uptimeMillis();
        this.MediaBrowserCompatItemReceiver.clear();
        this.MediaBrowserCompatItemReceiver.addAll(list);
        this.AudioAttributesCompatParcelizer.notifyDataSetChanged();
    }

    final class AudioAttributesCompatParcelizer extends ArrayAdapter<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> implements AdapterView.OnItemClickListener {
        private final Drawable IconCompatParcelizer;
        private final Drawable MediaBrowserCompatCustomActionResultReceiver;
        private final LayoutInflater RemoteActionCompatParcelizer;
        private final Drawable read;
        private final Drawable write;

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        public AudioAttributesCompatParcelizer(Context context, List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
            super(context, 0, list);
            this.RemoteActionCompatParcelizer = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteDefaultIconDrawable, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteTvIconDrawable, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteSpeakerIconDrawable, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteSpeakerGroupIconDrawable});
            this.write = typedArrayObtainStyledAttributes.getDrawable(0);
            this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getDrawable(1);
            this.read = typedArrayObtainStyledAttributes.getDrawable(2);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDrawable(3);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return getItem(i).onMediaButtonEvent();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.RemoteActionCompatParcelizer.inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_chooser_list_item, viewGroup, false);
            }
            ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver item = getItem(i);
            TextView textView = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_chooser_route_desc);
            textView.setText(item.AudioAttributesImplBaseParcelizer());
            String strRemoteActionCompatParcelizer = item.RemoteActionCompatParcelizer();
            if ((item.write() == 2 || item.write() == 1) && !TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(strRemoteActionCompatParcelizer);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(item.onMediaButtonEvent());
            ImageView imageView = (ImageView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(write(item));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver item = getItem(i);
            if (item.onMediaButtonEvent()) {
                item.onPlayFromMediaId();
                PrivateMaxEntriesMapValueIterator.this.dismiss();
            }
        }

        private Drawable write(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            Uri uriMediaBrowserCompatItemReceiver = mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
            if (uriMediaBrowserCompatItemReceiver != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uriMediaBrowserCompatItemReceiver), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    Objects.toString(uriMediaBrowserCompatItemReceiver);
                }
            }
            return read(mediaBrowserCompatCustomActionResultReceiver);
        }

        private Drawable read(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            int iAudioAttributesImplApi26Parcelizer = mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplApi26Parcelizer == 1) {
                return this.MediaBrowserCompatCustomActionResultReceiver;
            }
            if (iAudioAttributesImplApi26Parcelizer == 2) {
                return this.read;
            }
            if (mediaBrowserCompatCustomActionResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
                return this.IconCompatParcelizer;
            }
            return this.write;
        }
    }

    final class IconCompatParcelizer extends ExtensionsKtkotlinModule1.IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void read() {
            PrivateMaxEntriesMapValueIterator.this.write();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatItemReceiver() {
            PrivateMaxEntriesMapValueIterator.this.write();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            PrivateMaxEntriesMapValueIterator.this.write();
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            PrivateMaxEntriesMapValueIterator.this.dismiss();
        }
    }

    static final class RemoteActionCompatParcelizer implements Comparator<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2) {
            return IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver2);
        }

        private static int IconCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2) {
            return mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer().compareToIgnoreCase(mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesImplBaseParcelizer());
        }
    }
}

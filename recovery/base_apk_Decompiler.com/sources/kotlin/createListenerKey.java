package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createListenerKey extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> {
    private setPlaylistParserFactory AudioAttributesCompatParcelizer;
    private int read;
    private final List<notifyCacheIgnored> RemoteActionCompatParcelizer = new ArrayList();
    private shouldIgnoreCacheForRequest IconCompatParcelizer = shouldIgnoreCacheForRequest.AudioAttributesCompatParcelizer;

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup);
    }

    private void AudioAttributesCompatParcelizer(setPlaylistParserFactory setplaylistparserfactory) {
        toMagicModuleMetaRepoModel.write(setplaylistparserfactory, "");
        this.AudioAttributesCompatParcelizer = setplaylistparserfactory;
    }

    private setPlaylistParserFactory RemoteActionCompatParcelizer() {
        setPlaylistParserFactory setplaylistparserfactory = this.AudioAttributesCompatParcelizer;
        if (setplaylistparserfactory != null) {
            return setplaylistparserfactory;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void read(List<notifyCacheIgnored> list, int i, shouldIgnoreCacheForRequest shouldignorecacheforrequest) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(shouldignorecacheforrequest, "");
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.addAll(list);
        this.read = i;
        this.IconCompatParcelizer = shouldignorecacheforrequest;
        notifyDataSetChanged();
    }

    private AudioAttributesCompatParcelizer write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        setPlaylistParserFactory setplaylistparserfactoryRemoteActionCompatParcelizer = setPlaylistParserFactory.RemoteActionCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setplaylistparserfactoryRemoteActionCompatParcelizer, "");
        AudioAttributesCompatParcelizer(setplaylistparserfactoryRemoteActionCompatParcelizer);
        return new AudioAttributesCompatParcelizer(this, RemoteActionCompatParcelizer());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        notifyCacheIgnored notifycacheignored = this.RemoteActionCompatParcelizer.get(i);
        audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().setText(notifycacheignored.AudioAttributesCompatParcelizer());
        if (i == 0 && this.read > 10) {
            bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            TextView textViewAudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            int i2 = this.read;
            int size = this.RemoteActionCompatParcelizer.size();
            StringBuilder sb = new StringBuilder("+ ");
            sb.append((i2 - size) + 1);
            textViewAudioAttributesImplApi26Parcelizer.setText(sb.toString());
            bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver());
        } else {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver());
        }
        if (i == 0) {
            bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.read());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
        } else if (i == this.RemoteActionCompatParcelizer.size() - 2) {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.read());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
        } else if (i == this.RemoteActionCompatParcelizer.size() - 1) {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.read());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
        } else {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.read());
            bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
        }
        if (this.RemoteActionCompatParcelizer.size() == 2) {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.read());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
        }
        if (i == this.RemoteActionCompatParcelizer.size() - 1) {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.write());
            bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.RatingCompat());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.IconCompatParcelizer());
            return;
        }
        bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.write());
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer.RatingCompat());
        bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
        bytesRead.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer());
        ContentDataSourceContentDataSourceException contentDataSourceContentDataSourceException = ContentDataSourceContentDataSourceException.INSTANCE;
        String str = ContentDataSourceContentDataSourceException.read(notifycacheignored.read(), notifycacheignored.write());
        if (str != null) {
            TextView textViewIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("% Correct");
            textViewIconCompatParcelizer.setText(sb2.toString());
        }
        audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().setText(loadBitmap.RemoteActionCompatParcelizer(notifycacheignored.IconCompatParcelizer(), "dd MMM"));
    }

    public class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private final View AudioAttributesImplApi21Parcelizer;
        private final TextView AudioAttributesImplApi26Parcelizer;
        private final LinearLayout AudioAttributesImplBaseParcelizer;
        private final setPlaylistParserFactory IconCompatParcelizer;
        private /* synthetic */ createListenerKey MediaBrowserCompatCustomActionResultReceiver;
        private final View MediaBrowserCompatItemReceiver;
        private final TextView MediaBrowserCompatMediaItem;
        private final TextView MediaBrowserCompatSearchResultReceiver;
        private final LinearLayout RatingCompat;
        private final FrameLayout RemoteActionCompatParcelizer;
        private final LinearLayout read;
        private final View write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(createListenerKey createlistenerkey, setPlaylistParserFactory setplaylistparserfactory) {
            super(setplaylistparserfactory.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(setplaylistparserfactory, "");
            this.MediaBrowserCompatCustomActionResultReceiver = createlistenerkey;
            this.IconCompatParcelizer = setplaylistparserfactory;
            LinearLayout linearLayout = setplaylistparserfactory.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            this.RatingCompat = linearLayout;
            LinearLayout linearLayout2 = setplaylistparserfactory.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            this.read = linearLayout2;
            TextView textView = setplaylistparserfactory.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            this.MediaBrowserCompatMediaItem = textView;
            TextView textView2 = setplaylistparserfactory.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            this.AudioAttributesImplApi26Parcelizer = textView2;
            TextView textView3 = setplaylistparserfactory.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            this.AudioAttributesCompatParcelizer = textView3;
            View view = setplaylistparserfactory.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            this.MediaBrowserCompatItemReceiver = view;
            View view2 = setplaylistparserfactory.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            this.AudioAttributesImplApi21Parcelizer = view2;
            View view3 = setplaylistparserfactory.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view3, "");
            this.write = view3;
            FrameLayout frameLayout = setplaylistparserfactory.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
            this.RemoteActionCompatParcelizer = frameLayout;
            TextView textView4 = setplaylistparserfactory.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            this.MediaBrowserCompatSearchResultReceiver = textView4;
            LinearLayout linearLayout3 = setplaylistparserfactory.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            this.AudioAttributesImplBaseParcelizer = linearLayout3;
        }

        public final LinearLayout RatingCompat() {
            return this.RatingCompat;
        }

        public final LinearLayout write() {
            return this.read;
        }

        public final TextView MediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final TextView AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final TextView IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final View AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final View RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final View read() {
            return this.write;
        }

        public final FrameLayout AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final TextView AudioAttributesImplApi26Parcelizer() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final LinearLayout MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }
    }
}

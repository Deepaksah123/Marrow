package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.ApiApiOptionsNoOptions;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiApiOptionsNoOptions extends RecyclerView.IconCompatParcelizer<write> {
    private ArrayList<GoogleApiClient> AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private enqueue RemoteActionCompatParcelizer;
    private final getAnswerMap<Integer, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiApiOptionsNoOptions(getAnswerMap<? super Integer, getShowPopup> getanswermap, enqueue enqueueVar) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(enqueueVar, "");
        this.write = getanswermap;
        this.RemoteActionCompatParcelizer = enqueueVar;
        this.AudioAttributesCompatParcelizer = new ArrayList<>();
        this.IconCompatParcelizer = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    public final getAnswerMap<Integer, getShowPopup> read() {
        return this.write;
    }

    public class write extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private final MaterialCardView IconCompatParcelizer;
        private final TextView RemoteActionCompatParcelizer;
        private /* synthetic */ ApiApiOptionsNoOptions read;

        /* JADX INFO: renamed from: o.ApiApiOptionsNoOptions$write$write, reason: collision with other inner class name */
        public static final /* synthetic */ class C0018write {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[clearPrefixFlags.values().length];
                try {
                    iArr[clearPrefixFlags.RemoteActionCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[clearPrefixFlags.read.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[clearPrefixFlags.AudioAttributesCompatParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(ApiApiOptionsNoOptions apiApiOptionsNoOptions, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.read = apiApiOptionsNoOptions;
            this.IconCompatParcelizer = (MaterialCardView) view.findViewById(R.id.cvMain);
            this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(R.id.tvOptionIndex);
            this.RemoteActionCompatParcelizer = (TextView) view.findViewById(R.id.tvOptionString);
        }

        public final void read(GoogleApiClient googleApiClient, final int i) {
            toMagicModuleMetaRepoModel.write(googleApiClient, "");
            MaterialCardView materialCardView = this.IconCompatParcelizer;
            final ApiApiOptionsNoOptions apiApiOptionsNoOptions = this.read;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: o.getGoogleSignInAccount
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ApiApiOptionsNoOptions.write.read(apiApiOptionsNoOptions, i);
                }
            });
            this.AudioAttributesCompatParcelizer.setText(googleApiClient.getRemoteActionCompatParcelizer());
            this.RemoteActionCompatParcelizer.setText(googleApiClient.getWrite());
            int i2 = C0018write.IconCompatParcelizer[googleApiClient.getAudioAttributesCompatParcelizer().ordinal()];
            boolean z = false;
            if (i2 == 1) {
                Context context = this.itemView.getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
                AudioAttributesCompatParcelizer(R.attr.colorSurface, updateNavigation.read(context, 1), R.attr.onBackgroundSurface3, R.attr.colorOnSurface);
            } else if (i2 == 2) {
                AudioAttributesCompatParcelizer(R.attr.onSurfaceGreen2, 0, R.attr.onTag, R.attr.onTag);
            } else {
                if (i2 != 3) {
                    throw new RenewEligibleCreator();
                }
                AudioAttributesCompatParcelizer(R.attr.onSurfaceRed, 0, R.attr.colorOnSurfaceVariant, R.attr.colorOnSurfaceVariant);
            }
            MaterialCardView materialCardView2 = this.IconCompatParcelizer;
            if (!this.read.RemoteActionCompatParcelizer.onCommand() && googleApiClient.getIconCompatParcelizer()) {
                z = true;
            }
            materialCardView2.setClickable(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(ApiApiOptionsNoOptions apiApiOptionsNoOptions, int i) {
            apiApiOptionsNoOptions.read(i);
            apiApiOptionsNoOptions.read().invoke(Integer.valueOf(i));
        }

        private final void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
            MaterialCardView materialCardView = this.IconCompatParcelizer;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            materialCardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true));
            this.IconCompatParcelizer.setStrokeWidth(i2);
            TextView textView = this.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context2, i3, new TypedValue(), true));
            TextView textView2 = this.RemoteActionCompatParcelizer;
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            textView2.setTextColor(shouldEscapeCharacter.Companion.read(context3, i4, new TypedValue(), true));
        }
    }

    private write IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_mcq_option, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new write(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        GoogleApiClient googleApiClient = this.AudioAttributesCompatParcelizer.get(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(googleApiClient, "");
        writeVar.read(googleApiClient, i);
    }

    public final void RemoteActionCompatParcelizer(List<GoogleApiClient> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList<GoogleApiClient> arrayList = new ArrayList<>();
        this.AudioAttributesCompatParcelizer = arrayList;
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public final void read(int i) {
        if (i == this.RemoteActionCompatParcelizer.MediaMetadataCompat()) {
            ArrayList<GoogleApiClient> arrayList = this.AudioAttributesCompatParcelizer;
            GoogleApiClient googleApiClient = arrayList.get(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(googleApiClient, "");
            GoogleApiClient googleApiClient2 = googleApiClient;
            arrayList.set(i, GoogleApiClient.RemoteActionCompatParcelizer(googleApiClient2.RemoteActionCompatParcelizer, googleApiClient2.write, clearPrefixFlags.read, googleApiClient2.IconCompatParcelizer));
        } else {
            ArrayList<GoogleApiClient> arrayList2 = this.AudioAttributesCompatParcelizer;
            GoogleApiClient googleApiClient3 = arrayList2.get(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(googleApiClient3, "");
            GoogleApiClient googleApiClient4 = googleApiClient3;
            arrayList2.set(i, GoogleApiClient.RemoteActionCompatParcelizer(googleApiClient4.RemoteActionCompatParcelizer, googleApiClient4.write, clearPrefixFlags.AudioAttributesCompatParcelizer, googleApiClient4.IconCompatParcelizer));
            ArrayList<GoogleApiClient> arrayList3 = this.AudioAttributesCompatParcelizer;
            int iMediaMetadataCompat = this.RemoteActionCompatParcelizer.MediaMetadataCompat();
            GoogleApiClient googleApiClient5 = this.AudioAttributesCompatParcelizer.get(this.RemoteActionCompatParcelizer.MediaMetadataCompat());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(googleApiClient5, "");
            GoogleApiClient googleApiClient6 = googleApiClient5;
            arrayList3.set(iMediaMetadataCompat, GoogleApiClient.RemoteActionCompatParcelizer(googleApiClient6.RemoteActionCompatParcelizer, googleApiClient6.write, clearPrefixFlags.read, googleApiClient6.IconCompatParcelizer));
        }
        enqueue enqueueVar = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = enqueue.IconCompatParcelizer(enqueueVar.RatingCompat, enqueueVar.MediaBrowserCompatMediaItem, enqueueVar.MediaBrowserCompatCustomActionResultReceiver, enqueueVar.onMediaButtonEvent, enqueueVar.onPause, enqueueVar.AudioAttributesImplBaseParcelizer, enqueueVar.onFastForward, enqueueVar.onCustomAction, enqueueVar.onPlayFromMediaId, enqueueVar.MediaBrowserCompatSearchResultReceiver, enqueueVar.onCommand, enqueueVar.AudioAttributesImplApi21Parcelizer, enqueueVar.onPlay, enqueueVar.onAddQueueItem, enqueueVar.handleMediaPlayPauseIfPendingOnHandler, enqueueVar.AudioAttributesImplApi26Parcelizer, true, enqueueVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, enqueueVar.MediaDescriptionCompat, enqueueVar.onPrepareFromMediaId, enqueueVar.read, enqueueVar.AudioAttributesCompatParcelizer, enqueueVar.MediaBrowserCompatItemReceiver, enqueueVar.RemoteActionCompatParcelizer, enqueueVar.IconCompatParcelizer, enqueueVar.write);
        notifyDataSetChanged();
    }
}

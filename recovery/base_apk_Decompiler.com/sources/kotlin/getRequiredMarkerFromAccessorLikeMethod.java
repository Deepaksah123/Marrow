package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.view.Display;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.ConstructorValueCreator;
import kotlin.ExtensionsKtjacksonObjectMapper1;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.KotlinAnnotationIntrospector;
import kotlin.PrivateMaxEntriesMapNode;
import kotlin.accessgetNullToEmptyCollectionp;
import kotlin.jacksonObjectMapper;
import kotlin.kotlinModuledefault;
import kotlin.toBitSet;

/* JADX INFO: loaded from: classes4.dex */
abstract class getRequiredMarkerFromAccessorLikeMethod extends jacksonObjectMapper {

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(String str);
    }

    public void AudioAttributesCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
    }

    protected Object AudioAttributesImplBaseParcelizer() {
        return null;
    }

    public void IconCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
    }

    public void read(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
    }

    public void write(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
    }

    protected getRequiredMarkerFromAccessorLikeMethod(Context context) {
        super(context, new jacksonObjectMapper.RemoteActionCompatParcelizer(new ComponentName(LogSubCategory.LifeCycle.ANDROID, getRequiredMarkerFromAccessorLikeMethod.class.getName())));
    }

    public static getRequiredMarkerFromAccessorLikeMethod AudioAttributesCompatParcelizer(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return new write(context, audioAttributesCompatParcelizer);
    }

    static class IconCompatParcelizer extends getRequiredMarkerFromAccessorLikeMethod implements toBitSet.write, toBitSet.MediaBrowserCompatItemReceiver {
        private static final ArrayList<IntentFilter> AudioAttributesImplApi26Parcelizer;
        private static final ArrayList<IntentFilter> RatingCompat;
        protected final Object AudioAttributesCompatParcelizer;
        protected final Object AudioAttributesImplApi21Parcelizer;
        protected final Object AudioAttributesImplBaseParcelizer;
        protected final Object IconCompatParcelizer;
        protected final ArrayList<read> MediaBrowserCompatCustomActionResultReceiver;
        protected final ArrayList<AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver;
        private final AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem;
        private toBitSet.RemoteActionCompatParcelizer MediaDescriptionCompat;
        private toBitSet.read MediaMetadataCompat;
        protected boolean RemoteActionCompatParcelizer;
        protected int read;
        protected boolean write;

        @Override // o.toBitSet.write
        public void AudioAttributesCompatParcelizer(Object obj, Object obj2, int i) {
        }

        @Override // o.toBitSet.write
        public void read(int i, Object obj) {
        }

        @Override // o.toBitSet.write
        public void read(Object obj, Object obj2) {
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            AudioAttributesImplApi26Parcelizer = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            RatingCompat = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public IconCompatParcelizer(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(context);
            this.MediaBrowserCompatItemReceiver = new ArrayList<>();
            this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
            this.MediaBrowserCompatMediaItem = audioAttributesCompatParcelizer;
            Object objAudioAttributesCompatParcelizer = toBitSet.AudioAttributesCompatParcelizer(context);
            this.AudioAttributesCompatParcelizer = objAudioAttributesCompatParcelizer;
            this.IconCompatParcelizer = MediaBrowserCompatItemReceiver();
            this.AudioAttributesImplApi21Parcelizer = MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = toBitSet.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, context.getResources().getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_user_route_category_name), false);
            MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.jacksonObjectMapper
        public jacksonObjectMapper.AudioAttributesCompatParcelizer read(String str) {
            int iWrite = write(str);
            if (iWrite >= 0) {
                return new RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.get(iWrite).write);
            }
            return null;
        }

        @Override // kotlin.jacksonObjectMapper
        public void IconCompatParcelizer(C0183jsonMapper c0183jsonMapper) {
            boolean z;
            int i = 0;
            if (c0183jsonMapper != null) {
                List<String> listAudioAttributesCompatParcelizer = c0183jsonMapper.write().AudioAttributesCompatParcelizer();
                int size = listAudioAttributesCompatParcelizer.size();
                int i2 = 0;
                while (i < size) {
                    String str = listAudioAttributesCompatParcelizer.get(i);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i2 |= 1;
                    } else {
                        i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    }
                    i++;
                }
                z = c0183jsonMapper.read();
                i = i2;
            } else {
                z = false;
            }
            if (this.read == i && this.RemoteActionCompatParcelizer == z) {
                return;
            }
            this.read = i;
            this.RemoteActionCompatParcelizer = z;
            MediaBrowserCompatMediaItem();
        }

        @Override // o.toBitSet.write
        public void AudioAttributesCompatParcelizer(Object obj) {
            if (read(obj)) {
                MediaBrowserCompatSearchResultReceiver();
            }
        }

        private void MediaBrowserCompatMediaItem() {
            RatingCompat();
            Iterator it = toBitSet.read(this.AudioAttributesCompatParcelizer).iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= read(it.next());
            }
            if (z) {
                MediaBrowserCompatSearchResultReceiver();
            }
        }

        private boolean read(Object obj) {
            if (MediaBrowserCompatCustomActionResultReceiver(obj) != null || MediaBrowserCompatItemReceiver(obj) >= 0) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(obj, AudioAttributesImplApi21Parcelizer(obj));
            AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
            this.MediaBrowserCompatItemReceiver.add(audioAttributesCompatParcelizer);
            return true;
        }

        private String AudioAttributesImplApi21Parcelizer(Object obj) {
            String str;
            if (AudioAttributesImplBaseParcelizer() == obj) {
                str = "DEFAULT_ROUTE";
            } else {
                str = String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(AudioAttributesImplBaseParcelizer(obj).hashCode()));
            }
            if (write(str) < 0) {
                return str;
            }
            int i = 2;
            while (true) {
                String str2 = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i));
                if (write(str2) < 0) {
                    return str2;
                }
                i++;
            }
        }

        @Override // o.toBitSet.write
        public void write(Object obj) {
            int iMediaBrowserCompatItemReceiver;
            if (MediaBrowserCompatCustomActionResultReceiver(obj) != null || (iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(obj)) < 0) {
                return;
            }
            this.MediaBrowserCompatItemReceiver.remove(iMediaBrowserCompatItemReceiver);
            MediaBrowserCompatSearchResultReceiver();
        }

        @Override // o.toBitSet.write
        public void RemoteActionCompatParcelizer(Object obj) {
            int iMediaBrowserCompatItemReceiver;
            if (MediaBrowserCompatCustomActionResultReceiver(obj) != null || (iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(obj)) < 0) {
                return;
            }
            AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.get(iMediaBrowserCompatItemReceiver));
            MediaBrowserCompatSearchResultReceiver();
        }

        @Override // o.toBitSet.write
        public void IconCompatParcelizer(Object obj) {
            int iMediaBrowserCompatItemReceiver;
            if (MediaBrowserCompatCustomActionResultReceiver(obj) != null || (iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(obj)) < 0) {
                return;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.get(iMediaBrowserCompatItemReceiver);
            int iAudioAttributesCompatParcelizer = toBitSet.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj);
            if (iAudioAttributesCompatParcelizer != audioAttributesCompatParcelizer.read.handleMediaPlayPauseIfPendingOnHandler()) {
                audioAttributesCompatParcelizer.read = new ConstructorValueCreator.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.read).write(iAudioAttributesCompatParcelizer).IconCompatParcelizer();
                MediaBrowserCompatSearchResultReceiver();
            }
        }

        @Override // o.toBitSet.write
        public void IconCompatParcelizer(int i, Object obj) {
            if (obj == toBitSet.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 8388611)) {
                read readVarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(obj);
                if (readVarMediaBrowserCompatCustomActionResultReceiver != null) {
                    readVarMediaBrowserCompatCustomActionResultReceiver.read.onPlayFromMediaId();
                    return;
                }
                int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(obj);
                if (iMediaBrowserCompatItemReceiver >= 0) {
                    this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.get(iMediaBrowserCompatItemReceiver).IconCompatParcelizer);
                }
            }
        }

        @Override // o.toBitSet.MediaBrowserCompatItemReceiver
        public void AudioAttributesCompatParcelizer(Object obj, int i) {
            read readVarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(obj);
            if (readVarMediaBrowserCompatCustomActionResultReceiver != null) {
                readVarMediaBrowserCompatCustomActionResultReceiver.read.AudioAttributesCompatParcelizer(i);
            }
        }

        @Override // o.toBitSet.MediaBrowserCompatItemReceiver
        public void IconCompatParcelizer(Object obj, int i) {
            read readVarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(obj);
            if (readVarMediaBrowserCompatCustomActionResultReceiver != null) {
                readVarMediaBrowserCompatCustomActionResultReceiver.read.IconCompatParcelizer(i);
            }
        }

        @Override // kotlin.getRequiredMarkerFromAccessorLikeMethod
        public void IconCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            if (mediaBrowserCompatCustomActionResultReceiver.RatingCompat() != this) {
                Object objRemoteActionCompatParcelizer = toBitSet.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
                read readVar = new read(mediaBrowserCompatCustomActionResultReceiver, objRemoteActionCompatParcelizer);
                toBitSet.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, readVar);
                toBitSet.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
                write(readVar);
                this.MediaBrowserCompatCustomActionResultReceiver.add(readVar);
                toBitSet.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, objRemoteActionCompatParcelizer);
                return;
            }
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(toBitSet.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 8388611));
            if (iMediaBrowserCompatItemReceiver < 0 || !this.MediaBrowserCompatItemReceiver.get(iMediaBrowserCompatItemReceiver).IconCompatParcelizer.equals(mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer())) {
                return;
            }
            mediaBrowserCompatCustomActionResultReceiver.onPlayFromMediaId();
        }

        @Override // kotlin.getRequiredMarkerFromAccessorLikeMethod
        public void AudioAttributesCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            int iRemoteActionCompatParcelizer;
            if (mediaBrowserCompatCustomActionResultReceiver.RatingCompat() == this || (iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver)) < 0) {
                return;
            }
            read readVarRemove = this.MediaBrowserCompatCustomActionResultReceiver.remove(iRemoteActionCompatParcelizer);
            toBitSet.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(readVarRemove.RemoteActionCompatParcelizer, (Object) null);
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(readVarRemove.RemoteActionCompatParcelizer, (Object) null);
            toBitSet.read(this.AudioAttributesCompatParcelizer, readVarRemove.RemoteActionCompatParcelizer);
        }

        @Override // kotlin.getRequiredMarkerFromAccessorLikeMethod
        public void write(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            int iRemoteActionCompatParcelizer;
            if (mediaBrowserCompatCustomActionResultReceiver.RatingCompat() == this || (iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver)) < 0) {
                return;
            }
            write(this.MediaBrowserCompatCustomActionResultReceiver.get(iRemoteActionCompatParcelizer));
        }

        @Override // kotlin.getRequiredMarkerFromAccessorLikeMethod
        public void read(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            if (mediaBrowserCompatCustomActionResultReceiver.onFastForward()) {
                if (mediaBrowserCompatCustomActionResultReceiver.RatingCompat() != this) {
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
                    if (iRemoteActionCompatParcelizer >= 0) {
                        AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.get(iRemoteActionCompatParcelizer).RemoteActionCompatParcelizer);
                        return;
                    }
                    return;
                }
                int iWrite = write(mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
                if (iWrite >= 0) {
                    AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatItemReceiver.get(iWrite).write);
                }
            }
        }

        protected void MediaBrowserCompatSearchResultReceiver() {
            kotlinModuledefault.write writeVar = new kotlinModuledefault.write();
            int size = this.MediaBrowserCompatItemReceiver.size();
            for (int i = 0; i < size; i++) {
                writeVar.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.get(i).read);
            }
            write(writeVar.RemoteActionCompatParcelizer());
        }

        protected int MediaBrowserCompatItemReceiver(Object obj) {
            int size = this.MediaBrowserCompatItemReceiver.size();
            for (int i = 0; i < size; i++) {
                if (this.MediaBrowserCompatItemReceiver.get(i).write == obj) {
                    return i;
                }
            }
            return -1;
        }

        protected int write(String str) {
            int size = this.MediaBrowserCompatItemReceiver.size();
            for (int i = 0; i < size; i++) {
                if (this.MediaBrowserCompatItemReceiver.get(i).IconCompatParcelizer.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        protected int RemoteActionCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            int size = this.MediaBrowserCompatCustomActionResultReceiver.size();
            for (int i = 0; i < size; i++) {
                if (this.MediaBrowserCompatCustomActionResultReceiver.get(i).read == mediaBrowserCompatCustomActionResultReceiver) {
                    return i;
                }
            }
            return -1;
        }

        protected read MediaBrowserCompatCustomActionResultReceiver(Object obj) {
            Object objIconCompatParcelizer = toBitSet.AudioAttributesCompatParcelizer.IconCompatParcelizer(obj);
            if (objIconCompatParcelizer instanceof read) {
                return (read) objIconCompatParcelizer;
            }
            return null;
        }

        protected void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            ConstructorValueCreator.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ConstructorValueCreator.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer, AudioAttributesImplBaseParcelizer(audioAttributesCompatParcelizer.write));
            IconCompatParcelizer(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
            audioAttributesCompatParcelizer.read = remoteActionCompatParcelizer.IconCompatParcelizer();
        }

        protected String AudioAttributesImplBaseParcelizer(Object obj) {
            CharSequence charSequenceAudioAttributesCompatParcelizer = toBitSet.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj, AudioAttributesCompatParcelizer());
            return charSequenceAudioAttributesCompatParcelizer != null ? charSequenceAudioAttributesCompatParcelizer.toString() : "";
        }

        protected void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ConstructorValueCreator.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            int iWrite = toBitSet.AudioAttributesCompatParcelizer.write(audioAttributesCompatParcelizer.write);
            if ((iWrite & 1) != 0) {
                remoteActionCompatParcelizer.IconCompatParcelizer(AudioAttributesImplApi26Parcelizer);
            }
            if ((iWrite & 2) != 0) {
                remoteActionCompatParcelizer.IconCompatParcelizer(RatingCompat);
            }
            remoteActionCompatParcelizer.read(toBitSet.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.write));
            remoteActionCompatParcelizer.IconCompatParcelizer(toBitSet.AudioAttributesCompatParcelizer.read(audioAttributesCompatParcelizer.write));
            remoteActionCompatParcelizer.write(toBitSet.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.write));
            remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(toBitSet.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer.write));
            remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(toBitSet.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(audioAttributesCompatParcelizer.write));
        }

        protected void write(read readVar) {
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(readVar.RemoteActionCompatParcelizer, readVar.read.AudioAttributesImplBaseParcelizer());
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer, readVar.read.MediaMetadataCompat());
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(readVar.RemoteActionCompatParcelizer, readVar.read.AudioAttributesImplApi21Parcelizer());
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.read(readVar.RemoteActionCompatParcelizer, readVar.read.MediaDescriptionCompat());
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.write(readVar.RemoteActionCompatParcelizer, readVar.read.onCommand());
            toBitSet.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(readVar.RemoteActionCompatParcelizer, readVar.read.onAddQueueItem());
        }

        protected void RatingCompat() {
            if (this.write) {
                this.write = false;
                toBitSet.write(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
            }
            int i = this.read;
            if (i != 0) {
                this.write = true;
                toBitSet.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, i, this.IconCompatParcelizer);
            }
        }

        protected Object MediaBrowserCompatItemReceiver() {
            return toBitSet.AudioAttributesCompatParcelizer((toBitSet.write) this);
        }

        protected Object MediaBrowserCompatCustomActionResultReceiver() {
            return toBitSet.AudioAttributesCompatParcelizer((toBitSet.MediaBrowserCompatItemReceiver) this);
        }

        protected void AudioAttributesImplApi26Parcelizer(Object obj) {
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new toBitSet.read();
            }
            this.MediaMetadataCompat.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 8388611, obj);
        }

        @Override // kotlin.getRequiredMarkerFromAccessorLikeMethod
        protected Object AudioAttributesImplBaseParcelizer() {
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new toBitSet.RemoteActionCompatParcelizer();
            }
            return this.MediaDescriptionCompat.write(this.AudioAttributesCompatParcelizer);
        }

        protected static final class AudioAttributesCompatParcelizer {
            public final String IconCompatParcelizer;
            public ConstructorValueCreator read;
            public final Object write;

            public AudioAttributesCompatParcelizer(Object obj, String str) {
                this.write = obj;
                this.IconCompatParcelizer = str;
            }
        }

        protected static final class read {
            public final Object RemoteActionCompatParcelizer;
            public final ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver read;

            public read(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, Object obj) {
                this.read = mediaBrowserCompatCustomActionResultReceiver;
                this.RemoteActionCompatParcelizer = obj;
            }
        }

        protected static final class RemoteActionCompatParcelizer extends jacksonObjectMapper.AudioAttributesCompatParcelizer {
            private final Object AudioAttributesCompatParcelizer;

            public RemoteActionCompatParcelizer(Object obj) {
                this.AudioAttributesCompatParcelizer = obj;
            }

            @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer(int i) {
                toBitSet.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, i);
            }

            @Override // o.jacksonObjectMapper.AudioAttributesCompatParcelizer
            public final void write(int i) {
                toBitSet.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i);
            }
        }
    }

    static class read extends IconCompatParcelizer implements KotlinAnnotationIntrospector.IconCompatParcelizer {
        private KotlinAnnotationIntrospector.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
        private KotlinAnnotationIntrospector.write MediaDescriptionCompat;

        public read(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(context, audioAttributesCompatParcelizer);
        }

        @Override // o.KotlinAnnotationIntrospector.IconCompatParcelizer
        public void read(Object obj) {
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(obj);
            if (iMediaBrowserCompatItemReceiver >= 0) {
                IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ((IconCompatParcelizer) this).MediaBrowserCompatItemReceiver.get(iMediaBrowserCompatItemReceiver);
                Display displayRemoteActionCompatParcelizer = KotlinAnnotationIntrospector.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj);
                int displayId = displayRemoteActionCompatParcelizer != null ? displayRemoteActionCompatParcelizer.getDisplayId() : -1;
                if (displayId != audioAttributesCompatParcelizer.read.MediaMetadataCompat()) {
                    audioAttributesCompatParcelizer.read = new ConstructorValueCreator.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.read).AudioAttributesCompatParcelizer(displayId).IconCompatParcelizer();
                    MediaBrowserCompatSearchResultReceiver();
                }
            }
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void IconCompatParcelizer(IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ConstructorValueCreator.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super.IconCompatParcelizer(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
            if (!KotlinAnnotationIntrospector.RemoteActionCompatParcelizer.write(audioAttributesCompatParcelizer.write)) {
                remoteActionCompatParcelizer.write();
            }
            if (RemoteActionCompatParcelizer(audioAttributesCompatParcelizer)) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            Display displayRemoteActionCompatParcelizer = KotlinAnnotationIntrospector.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.write);
            if (displayRemoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(displayRemoteActionCompatParcelizer.getDisplayId());
            }
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void RatingCompat() {
            super.RatingCompat();
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.AudioAttributesImplApi26Parcelizer = new KotlinAnnotationIntrospector.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), AudioAttributesImplApi26Parcelizer());
            }
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(((IconCompatParcelizer) this).RemoteActionCompatParcelizer ? ((IconCompatParcelizer) this).read : 0);
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected Object MediaBrowserCompatItemReceiver() {
            return KotlinAnnotationIntrospector.IconCompatParcelizer(this);
        }

        protected boolean RemoteActionCompatParcelizer(IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new KotlinAnnotationIntrospector.write();
            }
            return this.MediaDescriptionCompat.IconCompatParcelizer(audioAttributesCompatParcelizer.write);
        }
    }

    static class RemoteActionCompatParcelizer extends read {
        public RemoteActionCompatParcelizer(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(context, audioAttributesCompatParcelizer);
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.read, o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void IconCompatParcelizer(IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ConstructorValueCreator.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super.IconCompatParcelizer(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
            CharSequence charSequenceIconCompatParcelizer = ExtensionsKtjacksonObjectMapper1.AudioAttributesCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer.write);
            if (charSequenceIconCompatParcelizer != null) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer.toString());
            }
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void AudioAttributesImplApi26Parcelizer(Object obj) {
            toBitSet.read(((IconCompatParcelizer) this).AudioAttributesCompatParcelizer, 8388611, obj);
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer, kotlin.getRequiredMarkerFromAccessorLikeMethod
        protected Object AudioAttributesImplBaseParcelizer() {
            return ExtensionsKtjacksonObjectMapper1.read(((IconCompatParcelizer) this).AudioAttributesCompatParcelizer);
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void write(IconCompatParcelizer.read readVar) {
            super.write(readVar);
            ExtensionsKtjacksonObjectMapper1.IconCompatParcelizer.write(readVar.RemoteActionCompatParcelizer, readVar.read.RemoteActionCompatParcelizer());
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.read, o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void RatingCompat() {
            if (((IconCompatParcelizer) this).write) {
                toBitSet.write(((IconCompatParcelizer) this).AudioAttributesCompatParcelizer, ((IconCompatParcelizer) this).IconCompatParcelizer);
            }
            ((IconCompatParcelizer) this).write = true;
            ExtensionsKtjacksonObjectMapper1.AudioAttributesCompatParcelizer(((IconCompatParcelizer) this).AudioAttributesCompatParcelizer, ((IconCompatParcelizer) this).read, ((IconCompatParcelizer) this).IconCompatParcelizer, (((IconCompatParcelizer) this).RemoteActionCompatParcelizer ? 1 : 0) | 2);
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.read
        protected boolean RemoteActionCompatParcelizer(IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            return ExtensionsKtjacksonObjectMapper1.AudioAttributesCompatParcelizer.write(audioAttributesCompatParcelizer.write);
        }
    }

    static class write extends RemoteActionCompatParcelizer {
        public write(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(context, audioAttributesCompatParcelizer);
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.RemoteActionCompatParcelizer, o.getRequiredMarkerFromAccessorLikeMethod.read, o.getRequiredMarkerFromAccessorLikeMethod.IconCompatParcelizer
        protected void IconCompatParcelizer(IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ConstructorValueCreator.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super.IconCompatParcelizer(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(accessgetNullToEmptyCollectionp.IconCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer.write));
        }
    }
}

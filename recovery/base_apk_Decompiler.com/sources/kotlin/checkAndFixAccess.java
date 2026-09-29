package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class checkAndFixAccess implements getClassDescription {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private int RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private initExtraTracks<C0170format> onAddQueueItem;
    private int read;
    private static final int[] RemoteActionCompatParcelizer = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final read write = new read(new read.RemoteActionCompatParcelizer() { // from class: o.classNameOf
        @Override // o.checkAndFixAccess.read.RemoteActionCompatParcelizer
        public final Constructor RemoteActionCompatParcelizer() {
            return checkAndFixAccess.read();
        }
    });
    private static final read IconCompatParcelizer = new read(new read.RemoteActionCompatParcelizer() { // from class: o.canBeABeanType
        @Override // o.checkAndFixAccess.read.RemoteActionCompatParcelizer
        public final Constructor RemoteActionCompatParcelizer() {
            return checkAndFixAccess.MediaBrowserCompatItemReceiver();
        }
    });
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
    private int onCustomAction = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;
    private withTimeZone.IconCompatParcelizer MediaBrowserCompatMediaItem = new _clearFormats();
    private boolean MediaMetadataCompat = true;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getClassDescription
    @Deprecated
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public checkAndFixAccess AudioAttributesCompatParcelizer(boolean z) {
        synchronized (this) {
            this.MediaMetadataCompat = z;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getClassDescription
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public checkAndFixAccess write(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem = iconCompatParcelizer;
        }
        return this;
    }

    public final checkAndFixAccess write(int i) {
        synchronized (this) {
            this.MediaBrowserCompatItemReceiver = 1;
        }
        return this;
    }

    @Override // kotlin.getClassDescription
    public final findConstructor[] RemoteActionCompatParcelizer() {
        findConstructor[] findconstructorArrWrite;
        synchronized (this) {
            findconstructorArrWrite = write(Uri.EMPTY, new HashMap());
        }
        return findconstructorArrWrite;
    }

    @Override // kotlin.getClassDescription
    public final findConstructor[] write(Uri uri, Map<String, List<String>> map) {
        findConstructor[] findconstructorArr;
        synchronized (this) {
            int[] iArr = RemoteActionCompatParcelizer;
            ArrayList arrayList = new ArrayList(iArr.length);
            int iIconCompatParcelizer = JsonNumberFormatVisitor.IconCompatParcelizer(map);
            if (iIconCompatParcelizer != -1) {
                read(iIconCompatParcelizer, arrayList);
            }
            int i = JsonNumberFormatVisitor.read(uri);
            if (i != -1 && i != iIconCompatParcelizer) {
                read(i, arrayList);
            }
            for (int i2 : iArr) {
                if (i2 != iIconCompatParcelizer && i2 != i) {
                    read(i2, arrayList);
                }
            }
            findconstructorArr = new findConstructor[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                findConstructor topattern = arrayList.get(i3);
                if (this.MediaMetadataCompat && !(topattern.write() instanceof NameTransformerChained) && !(topattern.write() instanceof NativeImageUtil) && !(topattern.write() instanceof removeFirst) && !(topattern.write() instanceof throwIfError) && !(topattern.write() instanceof serializedValueFor)) {
                    topattern = new toPattern(topattern, this.MediaBrowserCompatMediaItem);
                }
                findconstructorArr[i3] = topattern;
            }
        }
        return findconstructorArr;
    }

    private void read(int i, List<findConstructor> list) {
        switch (i) {
            case 0:
                list.add(new TypeKey());
                break;
            case 1:
                list.add(new isTyped());
                break;
            case 2:
                list.add(new getPrevious(0));
                break;
            case 3:
                list.add(new throwAsMappingException(0));
                break;
            case 4:
                findConstructor findconstructorRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(0);
                if (findconstructorRemoteActionCompatParcelizer != null) {
                    list.add(findconstructorRemoteActionCompatParcelizer);
                } else {
                    list.add(new enumTypeFor(this.AudioAttributesImplBaseParcelizer));
                }
                break;
            case 5:
                list.add(new ConverterNone());
                break;
            case 6:
                list.add(new serializedValueFor(this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat ? 0 : 2));
                break;
            case 7:
                list.add(new IgnorePropertiesUtil(0));
                break;
            case 8:
                list.add(new NameTransformerChained(this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat ? 0 : 32));
                list.add(new NativeImageUtil(this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat ? 0 : 16));
                break;
            case 9:
                list.add(new RawValue());
                break;
            case 10:
                list.add(new peekLast());
                break;
            case 11:
                if (this.onAddQueueItem == null) {
                    this.onAddQueueItem = initExtraTracks.AudioAttributesImplApi26Parcelizer();
                }
                list.add(new removeFirst(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, !this.MediaMetadataCompat ? 1 : 0, this.MediaBrowserCompatMediaItem, new MinimalClassNameIdResolver(0L), new setPrevious(this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem), this.onCustomAction));
                break;
            case 12:
                list.add(new unlink());
                break;
            case 14:
                list.add(new _constructUsingEnumNamingStrategy(this.MediaBrowserCompatItemReceiver));
                break;
            case 15:
                findConstructor findconstructorRemoteActionCompatParcelizer2 = IconCompatParcelizer.RemoteActionCompatParcelizer(new Object[0]);
                if (findconstructorRemoteActionCompatParcelizer2 != null) {
                    list.add(findconstructorRemoteActionCompatParcelizer2);
                }
                break;
            case 16:
                list.add(new throwIfError(!this.MediaMetadataCompat ? 1 : 0, this.MediaBrowserCompatMediaItem));
                break;
            case 17:
                list.add(new StdConverter());
                break;
            case 18:
                list.add(new LinkedDeque1());
                break;
            case 19:
                list.add(new ClassUtilCtor());
                break;
            case 20:
                list.add(new _constructUsingToString());
                break;
            case 21:
                list.add(new verifyMustOverride());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends findConstructor> MediaBrowserCompatItemReceiver() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(findConstructor.class).getConstructor(new Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends findConstructor> read() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(findConstructor.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    static final class read {
        private final RemoteActionCompatParcelizer IconCompatParcelizer;
        private final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
        private Constructor<? extends findConstructor> write;

        public interface RemoteActionCompatParcelizer {
            Constructor<? extends findConstructor> RemoteActionCompatParcelizer() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
        }

        public final findConstructor RemoteActionCompatParcelizer(Object... objArr) {
            Constructor<? extends findConstructor> constructorAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (constructorAudioAttributesCompatParcelizer == null) {
                return null;
            }
            try {
                return constructorAudioAttributesCompatParcelizer.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        private Constructor<? extends findConstructor> AudioAttributesCompatParcelizer() {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer.get()) {
                    return null;
                }
                try {
                    try {
                        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                    } catch (ClassNotFoundException unused) {
                        this.RemoteActionCompatParcelizer.set(true);
                        return null;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }
}

package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin._explicitClassOrOb;
import kotlin._ignorableAnnotation;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
public final class AnnotatedFieldCollectorFieldBuilder {

    public static final class RemoteActionCompatParcelizer extends _explicitClassOrOb<RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer> implements _addFieldMixIns {
        private static final RemoteActionCompatParcelizer DEFAULT_INSTANCE;
        private static volatile findInclusion<RemoteActionCompatParcelizer> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private _isStdJDKCollection<String, IconCompatParcelizer> preferences_ = _isStdJDKCollection.IconCompatParcelizer();

        /* JADX INFO: renamed from: o.AnnotatedFieldCollectorFieldBuilder$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        static final class C0017RemoteActionCompatParcelizer {
            static final BasicClassIntrospector<String, IconCompatParcelizer> IconCompatParcelizer = BasicClassIntrospector.write(_ignorableAnnotation.IconCompatParcelizer.STRING, "", _ignorableAnnotation.IconCompatParcelizer.MESSAGE, IconCompatParcelizer.read());
        }

        private RemoteActionCompatParcelizer() {
        }

        private _isStdJDKCollection<String, IconCompatParcelizer> AudioAttributesImplBaseParcelizer() {
            return this.preferences_;
        }

        private _isStdJDKCollection<String, IconCompatParcelizer> write() {
            if (!this.preferences_.write()) {
                this.preferences_ = this.preferences_.RemoteActionCompatParcelizer();
            }
            return this.preferences_;
        }

        public final Map<String, IconCompatParcelizer> RemoteActionCompatParcelizer() {
            return Collections.unmodifiableMap(AudioAttributesImplBaseParcelizer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, IconCompatParcelizer> read() {
            return write();
        }

        public static RemoteActionCompatParcelizer write(InputStream inputStream) throws IOException {
            return (RemoteActionCompatParcelizer) _explicitClassOrOb.IconCompatParcelizer(DEFAULT_INSTANCE, inputStream);
        }

        public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return DEFAULT_INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        public static final class AudioAttributesCompatParcelizer extends _explicitClassOrOb.AudioAttributesCompatParcelizer<RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer> implements _addFieldMixIns {
            /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
                this();
            }

            private AudioAttributesCompatParcelizer() {
                super(RemoteActionCompatParcelizer.DEFAULT_INSTANCE);
            }

            public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str, IconCompatParcelizer iconCompatParcelizer) {
                AudioAttributesImplApi26Parcelizer();
                ((RemoteActionCompatParcelizer) this.read).read().put(str, iconCompatParcelizer);
                return this;
            }
        }

        @Override // kotlin._explicitClassOrOb
        public final Object AudioAttributesCompatParcelizer(_explicitClassOrOb.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj, Object obj2) {
            findInclusion iconCompatParcelizer;
            switch (AnonymousClass2.write[audioAttributesImplApi21Parcelizer.ordinal()]) {
                case 1:
                    return new RemoteActionCompatParcelizer();
                case 2:
                    return new AudioAttributesCompatParcelizer((byte) 0);
                case 3:
                    return write(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0017RemoteActionCompatParcelizer.IconCompatParcelizer});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    findInclusion<RemoteActionCompatParcelizer> findinclusion = PARSER;
                    if (findinclusion != null) {
                        return findinclusion;
                    }
                    synchronized (RemoteActionCompatParcelizer.class) {
                        iconCompatParcelizer = PARSER;
                        if (iconCompatParcelizer == null) {
                            iconCompatParcelizer = new _explicitClassOrOb.IconCompatParcelizer(DEFAULT_INSTANCE);
                            PARSER = iconCompatParcelizer;
                        }
                        break;
                    }
                    return iconCompatParcelizer;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
            DEFAULT_INSTANCE = remoteActionCompatParcelizer;
            _explicitClassOrOb.read(RemoteActionCompatParcelizer.class, remoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: renamed from: o.AnnotatedFieldCollectorFieldBuilder$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.values().length];
            write = iArr;
            try {
                iArr[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[_explicitClassOrOb.AudioAttributesImplApi21Parcelizer.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class IconCompatParcelizer extends _explicitClassOrOb<IconCompatParcelizer, RemoteActionCompatParcelizer> implements collectFields {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final IconCompatParcelizer DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile findInclusion<IconCompatParcelizer> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        private IconCompatParcelizer() {
        }

        public enum write {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);

            private final int MediaBrowserCompatCustomActionResultReceiver;

            write(int i) {
                this.MediaBrowserCompatCustomActionResultReceiver = i;
            }

            public static write write(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }
        }

        public final write RatingCompat() {
            return write.write(this.valueCase_);
        }

        public final boolean write() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        public final float MediaBrowserCompatCustomActionResultReceiver() {
            return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(float f) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f);
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        public final long MediaBrowserCompatItemReceiver() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        public final String AudioAttributesImplApi21Parcelizer() {
            if (this.valueCase_ == 5) {
                return (String) this.value_;
            }
            return "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(String str) {
            this.valueCase_ = 5;
            this.value_ = str;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
            if (this.valueCase_ == 6) {
                return (AudioAttributesCompatParcelizer) this.value_;
            }
            return AudioAttributesCompatParcelizer.write();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) {
            this.value_ = iconCompatParcelizer.write();
            this.valueCase_ = 6;
        }

        public final double RemoteActionCompatParcelizer() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(double d) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d);
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            return DEFAULT_INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        public static final class RemoteActionCompatParcelizer extends _explicitClassOrOb.AudioAttributesCompatParcelizer<IconCompatParcelizer, RemoteActionCompatParcelizer> implements collectFields {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(IconCompatParcelizer.DEFAULT_INSTANCE);
            }

            public final RemoteActionCompatParcelizer IconCompatParcelizer(boolean z) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).AudioAttributesCompatParcelizer(z);
                return this;
            }

            public final RemoteActionCompatParcelizer IconCompatParcelizer(float f) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).read(f);
                return this;
            }

            public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).read(i);
                return this;
            }

            public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long j) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).RemoteActionCompatParcelizer(j);
                return this;
            }

            public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).IconCompatParcelizer(str);
                return this;
            }

            public final RemoteActionCompatParcelizer IconCompatParcelizer(AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).RemoteActionCompatParcelizer(iconCompatParcelizer);
                return this;
            }

            public final RemoteActionCompatParcelizer write(double d) {
                AudioAttributesImplApi26Parcelizer();
                ((IconCompatParcelizer) this.read).write(d);
                return this;
            }
        }

        @Override // kotlin._explicitClassOrOb
        public final Object AudioAttributesCompatParcelizer(_explicitClassOrOb.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj, Object obj2) {
            findInclusion iconCompatParcelizer;
            switch (AnonymousClass2.write[audioAttributesImplApi21Parcelizer.ordinal()]) {
                case 1:
                    return new IconCompatParcelizer();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return write(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", AudioAttributesCompatParcelizer.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    findInclusion<IconCompatParcelizer> findinclusion = PARSER;
                    if (findinclusion != null) {
                        return findinclusion;
                    }
                    synchronized (IconCompatParcelizer.class) {
                        iconCompatParcelizer = PARSER;
                        if (iconCompatParcelizer == null) {
                            iconCompatParcelizer = new _explicitClassOrOb.IconCompatParcelizer(DEFAULT_INSTANCE);
                            PARSER = iconCompatParcelizer;
                        }
                        break;
                    }
                    return iconCompatParcelizer;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            DEFAULT_INSTANCE = iconCompatParcelizer;
            _explicitClassOrOb.read(IconCompatParcelizer.class, iconCompatParcelizer);
        }

        public static IconCompatParcelizer read() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends _explicitClassOrOb<AudioAttributesCompatParcelizer, IconCompatParcelizer> implements _findFields {
        private static final AudioAttributesCompatParcelizer DEFAULT_INSTANCE;
        private static volatile findInclusion<AudioAttributesCompatParcelizer> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private forDeserialization.AudioAttributesImplBaseParcelizer<String> strings_ = _explicitClassOrOb.MediaBrowserCompatMediaItem();

        private AudioAttributesCompatParcelizer() {
        }

        public final List<String> read() {
            return this.strings_;
        }

        private void IconCompatParcelizer() {
            if (this.strings_.read()) {
                return;
            }
            this.strings_ = _explicitClassOrOb.IconCompatParcelizer(this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(Iterable<String> iterable) {
            IconCompatParcelizer();
            _isIncludableMemberMethod.RemoteActionCompatParcelizer(iterable, this.strings_);
        }

        public static IconCompatParcelizer RemoteActionCompatParcelizer() {
            return DEFAULT_INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        public static final class IconCompatParcelizer extends _explicitClassOrOb.AudioAttributesCompatParcelizer<AudioAttributesCompatParcelizer, IconCompatParcelizer> implements _findFields {
            /* synthetic */ IconCompatParcelizer(byte b) {
                this();
            }

            private IconCompatParcelizer() {
                super(AudioAttributesCompatParcelizer.DEFAULT_INSTANCE);
            }

            public final IconCompatParcelizer AudioAttributesCompatParcelizer(Iterable<String> iterable) {
                AudioAttributesImplApi26Parcelizer();
                ((AudioAttributesCompatParcelizer) this.read).AudioAttributesCompatParcelizer(iterable);
                return this;
            }
        }

        @Override // kotlin._explicitClassOrOb
        public final Object AudioAttributesCompatParcelizer(_explicitClassOrOb.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj, Object obj2) {
            findInclusion iconCompatParcelizer;
            switch (AnonymousClass2.write[audioAttributesImplApi21Parcelizer.ordinal()]) {
                case 1:
                    return new AudioAttributesCompatParcelizer();
                case 2:
                    return new IconCompatParcelizer((byte) 0);
                case 3:
                    return write(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    findInclusion<AudioAttributesCompatParcelizer> findinclusion = PARSER;
                    if (findinclusion != null) {
                        return findinclusion;
                    }
                    synchronized (AudioAttributesCompatParcelizer.class) {
                        iconCompatParcelizer = PARSER;
                        if (iconCompatParcelizer == null) {
                            iconCompatParcelizer = new _explicitClassOrOb.IconCompatParcelizer(DEFAULT_INSTANCE);
                            PARSER = iconCompatParcelizer;
                        }
                        break;
                    }
                    return iconCompatParcelizer;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
            DEFAULT_INSTANCE = audioAttributesCompatParcelizer;
            _explicitClassOrOb.read(AudioAttributesCompatParcelizer.class, audioAttributesCompatParcelizer);
        }

        public static AudioAttributesCompatParcelizer write() {
            return DEFAULT_INSTANCE;
        }
    }
}

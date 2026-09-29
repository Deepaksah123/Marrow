package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\t\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\t\u001a9\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a\u0019\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0004\u001a!\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\t\u001a9\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u0011\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b\f\u0010\u0004\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u0004\u001a%\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0016\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00172\b\b\u0002\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\r\u0010\u0018\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00192\b\b\u0002\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\u0005\u0010\u001a\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\t\"\u0014\u0010\b\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c\"\u0014\u0010\f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c\"\u0014\u0010\u0005\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c\"\u0014\u0010\u0010\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e\"\u0014\u0010\r\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e\"\u0014\u0010\u0003\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e\"\u0014\u0010\u0006\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e"}, d2 = {"Lo/_handleOddName;", "Lo/assignParameter;", "p0", "AudioAttributesImplApi26Parcelizer", "(Lo/_handleOddName;F)Lo/_handleOddName;", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "p1", "read", "(Lo/_handleOddName;FF)Lo/_handleOddName;", "Lo/handleIdValue;", "(Lo/_handleOddName;J)Lo/_handleOddName;", "write", "IconCompatParcelizer", "p2", "p3", "RemoteActionCompatParcelizer", "(Lo/_handleOddName;FFFF)Lo/_handleOddName;", "MediaBrowserCompatItemReceiver", "", "Lo/_skipWSOrEnd$write;", "", "(Lo/_handleOddName;Lo/_skipWSOrEnd$write;Z)Lo/_handleOddName;", "Lo/_skipWSOrEnd$read;", "(Lo/_handleOddName;Lo/_skipWSOrEnd$read;Z)Lo/_handleOddName;", "Lo/_skipWSOrEnd;", "(Lo/_handleOddName;Lo/_skipWSOrEnd;Z)Lo/_handleOddName;", "Lo/createFragmentContainer;", "Lo/createFragmentContainer;", "Lo/onResume;", "Lo/onResume;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isAdded {
    private static final createFragmentContainer IconCompatParcelizer = createFragmentContainer.INSTANCE.IconCompatParcelizer(1.0f);
    private static final createFragmentContainer read = createFragmentContainer.INSTANCE.AudioAttributesCompatParcelizer(1.0f);
    private static final createFragmentContainer RemoteActionCompatParcelizer = createFragmentContainer.INSTANCE.write(1.0f);
    private static final onResume AudioAttributesImplBaseParcelizer = onResume.INSTANCE.write(_skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), false);
    private static final onResume MediaBrowserCompatCustomActionResultReceiver = onResume.INSTANCE.write(_skipWSOrEnd.INSTANCE.RatingCompat(), false);
    private static final onResume write = onResume.INSTANCE.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), false);
    private static final onResume AudioAttributesCompatParcelizer = onResume.INSTANCE.RemoteActionCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), false);
    private static final onResume MediaBrowserCompatItemReceiver = onResume.INSTANCE.read(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
    private static final onResume AudioAttributesImplApi26Parcelizer = onResume.INSTANCE.read(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);

    /* JADX INFO: renamed from: o.isAdded$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "read", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            read(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void read(as asVar) {
            asVar.write("height");
            asVar.write(assignParameter.read(this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(1);
            this.$RemoteActionCompatParcelizer = f;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $AudioAttributesCompatParcelizer;
        final /* synthetic */ float $IconCompatParcelizer;
        final /* synthetic */ float $RemoteActionCompatParcelizer;
        final /* synthetic */ float $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("requiredSizeIn");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("minWidth", assignParameter.read(this.$write));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("minHeight", assignParameter.read(this.$RemoteActionCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("maxWidth", assignParameter.read(this.$AudioAttributesCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("maxHeight", assignParameter.read(this.$IconCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(float f, float f2, float f3, float f4) {
            super(1);
            this.$write = f;
            this.$RemoteActionCompatParcelizer = f2;
            this.$AudioAttributesCompatParcelizer = f3;
            this.$IconCompatParcelizer = f4;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$15, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass15 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $AudioAttributesCompatParcelizer;
        final /* synthetic */ float $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("widthIn");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("min", assignParameter.read(this.$AudioAttributesCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("max", assignParameter.read(this.$write));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(float f, float f2) {
            super(1);
            this.$AudioAttributesCompatParcelizer = f;
            this.$write = f2;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("requiredHeight");
            asVar.write(assignParameter.read(this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f) {
            super(1);
            this.$RemoteActionCompatParcelizer = f;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "AudioAttributesCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $AudioAttributesCompatParcelizer;
        final /* synthetic */ float $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            AudioAttributesCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(as asVar) {
            asVar.write("requiredSize");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("width", assignParameter.read(this.$AudioAttributesCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("height", assignParameter.read(this.$IconCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(float f, float f2) {
            super(1);
            this.$AudioAttributesCompatParcelizer = f;
            this.$IconCompatParcelizer = f2;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("requiredSize");
            asVar.write(assignParameter.read(this.$read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f) {
            super(1);
            this.$read = f;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $read;
        final /* synthetic */ float $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("heightIn");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("min", assignParameter.read(this.$write));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("max", assignParameter.read(this.$read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(float f, float f2) {
            super(1);
            this.$write = f;
            this.$read = f2;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "read", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $AudioAttributesCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            read(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void read(as asVar) {
            asVar.write("width");
            asVar.write(assignParameter.read(this.$AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(float f) {
            super(1);
            this.$AudioAttributesCompatParcelizer = f;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $AudioAttributesCompatParcelizer;
        final /* synthetic */ float $RemoteActionCompatParcelizer;
        final /* synthetic */ float $read;
        final /* synthetic */ float $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("sizeIn");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("minWidth", assignParameter.read(this.$AudioAttributesCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("minHeight", assignParameter.read(this.$write));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("maxWidth", assignParameter.read(this.$read));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("maxHeight", assignParameter.read(this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(float f, float f2, float f3, float f4) {
            super(1);
            this.$AudioAttributesCompatParcelizer = f;
            this.$write = f2;
            this.$read = f3;
            this.$RemoteActionCompatParcelizer = f4;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $IconCompatParcelizer;
        final /* synthetic */ float $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("size");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("width", assignParameter.read(this.$RemoteActionCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("height", assignParameter.read(this.$IconCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(float f, float f2) {
            super(1);
            this.$RemoteActionCompatParcelizer = f;
            this.$IconCompatParcelizer = f2;
        }
    }

    /* JADX INFO: renamed from: o.isAdded$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ float $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("size");
            asVar.write(assignParameter.read(this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(float f) {
            super(1);
            this.$RemoteActionCompatParcelizer = f;
        }
    }

    public static final _handleOddName read(_handleOddName _handleoddname, long j) {
        return read(_handleoddname, handleIdValue.IconCompatParcelizer(j), handleIdValue.write(j));
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        return write(_handleoddname, f, f2);
    }

    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        return IconCompatParcelizer(_handleoddname, f, f2);
    }

    public static /* synthetic */ _handleOddName RemoteActionCompatParcelizer$default(_handleOddName _handleoddname, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 4) != 0) {
            f3 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 8) != 0) {
            f4 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        return RemoteActionCompatParcelizer(_handleoddname, f, f2, f3, f4);
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 4) != 0) {
            f3 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 8) != 0) {
            f4 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        return write(_handleoddname, f, f2, f3, f4);
    }

    public static /* synthetic */ _handleOddName RemoteActionCompatParcelizer$default(_handleOddName _handleoddname, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return RemoteActionCompatParcelizer(_handleoddname, f);
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(f == 1.0f ? IconCompatParcelizer : createFragmentContainer.INSTANCE.IconCompatParcelizer(f));
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return write(_handleoddname, f);
    }

    public static final _handleOddName write(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(f == 1.0f ? read : createFragmentContainer.INSTANCE.AudioAttributesCompatParcelizer(f));
    }

    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return IconCompatParcelizer(_handleoddname, f);
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(f == 1.0f ? RemoteActionCompatParcelizer : createFragmentContainer.INSTANCE.write(f));
    }

    public static /* synthetic */ _handleOddName RemoteActionCompatParcelizer$default(_handleOddName _handleoddname, _skipWSOrEnd.write writeVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            writeVar = _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return RemoteActionCompatParcelizer(_handleoddname, writeVar, z);
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd.write writeVar, boolean z) {
        onResume onresumeWrite;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer()) && !z) {
            onresumeWrite = AudioAttributesImplBaseParcelizer;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, _skipWSOrEnd.INSTANCE.RatingCompat()) && !z) {
            onresumeWrite = MediaBrowserCompatCustomActionResultReceiver;
        } else {
            onresumeWrite = onResume.INSTANCE.write(writeVar, z);
        }
        return _handleoddname.AudioAttributesCompatParcelizer(onresumeWrite);
    }

    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, _skipWSOrEnd.read readVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            readVar = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return IconCompatParcelizer(_handleoddname, readVar, z);
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd.read readVar, boolean z) {
        onResume onresumeRemoteActionCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVar, _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver()) && !z) {
            onresumeRemoteActionCompatParcelizer = write;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVar, _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem()) && !z) {
            onresumeRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
        } else {
            onresumeRemoteActionCompatParcelizer = onResume.INSTANCE.RemoteActionCompatParcelizer(readVar, z);
        }
        return _handleoddname.AudioAttributesCompatParcelizer(onresumeRemoteActionCompatParcelizer);
    }

    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer$default(_handleOddName _handleoddname, _skipWSOrEnd _skipwsorend, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            _skipwsorend = _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return AudioAttributesCompatParcelizer(_handleoddname, _skipwsorend, z);
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd _skipwsorend, boolean z) {
        onResume onresume;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_skipwsorend, _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer()) && !z) {
            onresume = MediaBrowserCompatItemReceiver;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_skipwsorend, _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver()) && !z) {
            onresume = AudioAttributesImplApi26Parcelizer;
        } else {
            onresume = onResume.INSTANCE.read(_skipwsorend, z);
        }
        return _handleoddname.AudioAttributesCompatParcelizer(onresume);
    }

    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer$default(_handleOddName _handleoddname, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.INSTANCE.RemoteActionCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(_handleoddname, f, f2);
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, float f, float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new isRemoving(f, f2, null));
    }

    public static final _handleOddName AudioAttributesImplApi26Parcelizer(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass6(f) : C0214type.read(), 10, null));
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass1(f) : C0214type.read(), 5, null));
    }

    public static final _handleOddName AudioAttributesImplBaseParcelizer(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, f, f, f, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass9(f) : C0214type.read(), null));
    }

    public static final _handleOddName read(_handleOddName _handleoddname, float f, float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, f2, f, f2, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass8(f, f2) : C0214type.read(), null));
    }

    public static final _handleOddName write(_handleOddName _handleoddname, float f, float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass15(f, f2) : C0214type.read(), 10, null));
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, float f, float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f2, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass5(f, f2) : C0214type.read(), 5, null));
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, float f, float f2, float f3, float f4) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, f2, f3, f4, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass7(f, f2, f3, f4) : C0214type.read(), null));
    }

    public static final _handleOddName read(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, false, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass2(f) : C0214type.read(), 5, null));
    }

    public static final _handleOddName MediaBrowserCompatItemReceiver(_handleOddName _handleoddname, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, f, f, f, false, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass4(f) : C0214type.read(), null));
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, float f, float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, f2, f, f2, false, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass3(f, f2) : C0214type.read(), null));
    }

    public static final _handleOddName write(_handleOddName _handleoddname, float f, float f2, float f3, float f4) {
        return _handleoddname.AudioAttributesCompatParcelizer(new initState(f, f2, f3, f4, false, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass10(f, f2, f3, f4) : C0214type.read(), null));
    }
}

package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/_handleOddName;", "Lo/switchToNext;", "p0", "Lo/findAndAddVirtualProperties;", "p1", "IconCompatParcelizer", "(Lo/_handleOddName;JLo/findAndAddVirtualProperties;)Lo/_handleOddName;", "Lo/Instantiatable;", "", "p2", "write", "(Lo/_handleOddName;Lo/Instantiatable;Lo/findAndAddVirtualProperties;F)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getFrameEndSchedulerui {
    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, long j, findAndAddVirtualProperties findandaddvirtualproperties, int i, Object obj) {
        if ((i & 2) != 0) {
            findandaddvirtualproperties = parseVersion.read();
        }
        return IconCompatParcelizer(_handleoddname, j, findandaddvirtualproperties);
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            findandaddvirtualproperties = parseVersion.read();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return write(_handleoddname, instantiatable, findandaddvirtualproperties, f);
    }

    /* JADX INFO: renamed from: o.getFrameEndSchedulerui$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ Instantiatable $IconCompatParcelizer;
        final /* synthetic */ float $RemoteActionCompatParcelizer;
        final /* synthetic */ findAndAddVirtualProperties $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("background");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("alpha", Float.valueOf(this.$RemoteActionCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("brush", this.$IconCompatParcelizer);
            asVar.getIconCompatParcelizer().IconCompatParcelizer("shape", this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties) {
            super(1);
            this.$RemoteActionCompatParcelizer = f;
            this.$IconCompatParcelizer = instantiatable;
            this.$read = findandaddvirtualproperties;
        }
    }

    /* JADX INFO: renamed from: o.getFrameEndSchedulerui$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ long $RemoteActionCompatParcelizer;
        final /* synthetic */ findAndAddVirtualProperties $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("background");
            asVar.write(switchToNext.write(this.$RemoteActionCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer(TtmlNode.ATTR_TTS_COLOR, switchToNext.write(this.$RemoteActionCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("shape", this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, findAndAddVirtualProperties findandaddvirtualproperties) {
            super(1);
            this.$RemoteActionCompatParcelizer = j;
            this.$read = findandaddvirtualproperties;
        }
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, long j, findAndAddVirtualProperties findandaddvirtualproperties) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getCoroutineContext(j, null, 1.0f, findandaddvirtualproperties, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass2(j, findandaddvirtualproperties) : C0214type.read(), 2, null));
    }

    public static final _handleOddName write(_handleOddName _handleoddname, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties, float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getCoroutineContext(0L, instantiatable, f, findandaddvirtualproperties, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass1(f, instantiatable, findandaddvirtualproperties) : C0214type.read(), 1, null));
    }
}

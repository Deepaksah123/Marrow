package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\r\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0019Ji\u0010\r\u001a\u00020\u00122\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010!J7\u0010\r\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\"H\u0016¢\u0006\u0004\b\r\u0010#J1\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010$2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J)\u0010\r\u001a\u00020\n*\u00020'2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u000f2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010)J)\u0010\u0013\u001a\u00020\n*\u00020'2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u000f2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010)J)\u0010%\u001a\u00020\n*\u00020'2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u000f2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010)J)\u0010*\u001a\u00020\n*\u00020'2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u000f2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010)J\u001a\u0010,\u001a\u00020\"2\b\u0010\u0004\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00104"}, d2 = {"Lo/hasOptionsMenu;", "Lo/withTypeHandler;", "Lo/getSharedElementTargetNames;", "Lo/WindowInsetsCompatImpl30$write;", "p0", "Lo/_skipWSOrEnd$read;", "p1", "<init>", "(Lo/WindowInsetsCompatImpl30$write;Lo/_skipWSOrEnd$read;)V", "Lo/_parser;", "", "IconCompatParcelizer", "(Lo/_parser;)I", "write", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "", "p2", "p3", "", "(I[I[ILo/withContentValueHandler;)V", "", "p4", "p5", "p6", "p7", "p8", "p9", "([Lo/_parser;Lo/withContentValueHandler;I[III[IIII)Lo/withHandlersFrom;", "", "(IIIIZ)J", "Lo/getText;", "RemoteActionCompatParcelizer", "(Lo/_parser;Lo/getText;II)I", "Lo/getValueHandler;", "Lo/hasHandlers;", "(Lo/getValueHandler;Ljava/util/List;I)I", "read", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/WindowInsetsCompatImpl30$write;", "Lo/_skipWSOrEnd$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class hasOptionsMenu implements withTypeHandler, getSharedElementTargetNames {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final WindowInsetsCompatImpl30.write read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _skipWSOrEnd.read RemoteActionCompatParcelizer;

    public hasOptionsMenu(WindowInsetsCompatImpl30.write writeVar, _skipWSOrEnd.read readVar) {
        this.read = writeVar;
        this.RemoteActionCompatParcelizer = readVar;
    }

    @Override // kotlin.getSharedElementTargetNames
    public final int IconCompatParcelizer(_parser _parserVar) {
        return _parserVar.getRead();
    }

    @Override // kotlin.getSharedElementTargetNames
    public final int write(_parser _parserVar) {
        return _parserVar.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        return getUserVisibleHint.IconCompatParcelizer(this, PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), PropertyValueAny.AudioAttributesImplBaseParcelizer(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), withcontentvaluehandler.IconCompatParcelizer(this.read.getRead()), withcontentvaluehandler, list, new _parser[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // kotlin.getSharedElementTargetNames
    public final void write(int p0, int[] p1, int[] p2, withContentValueHandler p3) {
        this.read.AudioAttributesCompatParcelizer(p3, p0, p1, p3.getRead(), p2);
    }

    @Override // kotlin.getSharedElementTargetNames
    public final withHandlersFrom write(final _parser[] p0, withContentValueHandler p1, final int p2, final int[] p3, int p4, final int p5, int[] p6, int p7, int p8, int p9) {
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(p1, p4, p5, null, new getAnswerMap() { // from class: o.getViewLifecycleOwner
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return hasOptionsMenu.RemoteActionCompatParcelizer(p0, this, p5, p2, p3, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    @Override // kotlin.getSharedElementTargetNames
    public final long write(int p0, int p1, int p2, int p3, boolean p4) {
        return getTag.write(p4, p0, p1, p2, p3);
    }

    private final int RemoteActionCompatParcelizer(_parser p0, getText p1, int p2, int p3) {
        BackStackState audioAttributesCompatParcelizer = p1 != null ? p1.getAudioAttributesCompatParcelizer() : null;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p2, write(p0), tryToResolveUnresolved.write, p0, p3);
        }
        return this.RemoteActionCompatParcelizer.read(write(p0), p2);
    }

    @Override // kotlin.withTypeHandler
    public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return generateActivityResultKey.INSTANCE.read(list, i, getvaluehandler.IconCompatParcelizer(this.read.getRead()));
    }

    @Override // kotlin.withTypeHandler
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return generateActivityResultKey.INSTANCE.IconCompatParcelizer(list, i, getvaluehandler.IconCompatParcelizer(this.read.getRead()));
    }

    @Override // kotlin.withTypeHandler
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return generateActivityResultKey.INSTANCE.write(list, i, getvaluehandler.IconCompatParcelizer(this.read.getRead()));
    }

    @Override // kotlin.withTypeHandler
    public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return generateActivityResultKey.INSTANCE.AudioAttributesCompatParcelizer(list, i, getvaluehandler.IconCompatParcelizer(this.read.getRead()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_parser[] _parserVarArr, hasOptionsMenu hasoptionsmenu, int i, int i2, int[] iArr, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int length = _parserVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            _parser _parserVar = _parserVarArr[i3];
            toMagicModuleMetaRepoModel.write(_parserVar);
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, iArr[i4], hasoptionsmenu.RemoteActionCompatParcelizer(_parserVar, getTargetRequestCode.IconCompatParcelizer(_parserVar), i, i2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            i3++;
            i4++;
        }
        return getShowPopup.INSTANCE;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof hasOptionsMenu)) {
            return false;
        }
        hasOptionsMenu hasoptionsmenu = (hasOptionsMenu) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, hasoptionsmenu.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, hasoptionsmenu.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("hasOptionsMenu(read=");
        sb.append(this.read);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}

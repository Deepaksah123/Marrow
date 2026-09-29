package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J7\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0006\u0010\u000eJi\u0010\u0006\u001a\u00020\u00172\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0018J/\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u001aJ/\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0010H&¢\u0006\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010 R\u0014\u0010#\u001a\u00020!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\"R\u0014\u0010\u0004\u001a\u00020$8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/onStart;", "Lo/getSharedElementTargetNames;", "Lo/_parser;", "", "IconCompatParcelizer", "(Lo/_parser;)I", "write", "p0", "p1", "p2", "p3", "", "p4", "Lo/PropertyValueAny;", "(IIIIZ)J", "", "Lo/withContentValueHandler;", "", "p5", "p6", "p7", "p8", "p9", "Lo/withHandlersFrom;", "([Lo/_parser;Lo/withContentValueHandler;I[III[IIII)Lo/withHandlersFrom;", "Lo/tryToResolveUnresolved;", "(Lo/_parser;ILo/tryToResolveUnresolved;I)I", "", "(I[I[ILo/withContentValueHandler;)V", "()Z", "AudioAttributesCompatParcelizer", "Lo/WindowInsetsCompatImpl30$write;", "()Lo/WindowInsetsCompatImpl30$write;", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "()Lo/WindowInsetsCompatImpl30$RatingCompat;", "read", "Lo/BackStackState;", "RemoteActionCompatParcelizer", "()Lo/BackStackState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface onStart extends getSharedElementTargetNames {
    WindowInsetsCompatImpl30.RatingCompat AudioAttributesCompatParcelizer();

    boolean IconCompatParcelizer();

    BackStackState RemoteActionCompatParcelizer();

    WindowInsetsCompatImpl30.write write();

    @Override // kotlin.getSharedElementTargetNames
    default int IconCompatParcelizer(_parser _parserVar) {
        return IconCompatParcelizer() ? _parserVar.MediaBrowserCompatSearchResultReceiver() : _parserVar.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.getSharedElementTargetNames
    default int write(_parser _parserVar) {
        return IconCompatParcelizer() ? _parserVar.AudioAttributesImplBaseParcelizer() : _parserVar.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getSharedElementTargetNames
    default long write(int p0, int p1, int p2, int p3, boolean p4) {
        if (IconCompatParcelizer()) {
            return getTag.write(p4, p0, p1, p2, p3);
        }
        return setValue.IconCompatParcelizer(p4, p0, p1, p2, p3);
    }

    @Override // kotlin.getSharedElementTargetNames
    default withHandlersFrom write(final _parser[] p0, withContentValueHandler p1, final int p2, final int[] p3, int p4, final int p5, final int[] p6, final int p7, final int p8, final int p9) {
        int i;
        int i2;
        tryToResolveUnresolved trytoresolveunresolved;
        if (IconCompatParcelizer()) {
            i2 = p4;
            i = p5;
        } else {
            i = p4;
            i2 = p5;
        }
        if (IconCompatParcelizer()) {
            trytoresolveunresolved = tryToResolveUnresolved.write;
        } else {
            trytoresolveunresolved = p1.getRead();
        }
        final tryToResolveUnresolved trytoresolveunresolved2 = trytoresolveunresolved;
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(p1, i2, i, null, new getAnswerMap() { // from class: o.requireDialog
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onStart.IconCompatParcelizer(p6, p7, p8, p9, p0, this, p5, trytoresolveunresolved2, p2, p3, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static getShowPopup IconCompatParcelizer(int[] iArr, int i, int i2, int i3, _parser[] _parserVarArr, onStart onstart, int i4, tryToResolveUnresolved trytoresolveunresolved, int i5, int[] iArr2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int i6 = iArr != null ? iArr[i] : 0;
        for (int i7 = i2; i7 < i3; i7++) {
            _parser _parserVar = _parserVarArr[i7];
            toMagicModuleMetaRepoModel.write(_parserVar);
            int iIconCompatParcelizer = onstart.IconCompatParcelizer(_parserVar, i4, trytoresolveunresolved, i5) + i6;
            if (onstart.IconCompatParcelizer()) {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, iArr2[i7 - i2], iIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            } else {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, iIconCompatParcelizer, iArr2[i7 - i2], BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
        }
        return getShowPopup.INSTANCE;
    }

    default int IconCompatParcelizer(_parser p0, int p1, tryToResolveUnresolved p2, int p3) {
        BackStackState backStackStateRemoteActionCompatParcelizer;
        getText gettextIconCompatParcelizer = getTargetRequestCode.IconCompatParcelizer(p0);
        if (gettextIconCompatParcelizer == null || (backStackStateRemoteActionCompatParcelizer = gettextIconCompatParcelizer.getAudioAttributesCompatParcelizer()) == null) {
            backStackStateRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        }
        return backStackStateRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p1, write(p0), p2, p0, p3);
    }

    @Override // kotlin.getSharedElementTargetNames
    default void write(int p0, int[] p1, int[] p2, withContentValueHandler p3) {
        if (IconCompatParcelizer()) {
            write().AudioAttributesCompatParcelizer(p3, p0, p1, p3.getRead(), p2);
        } else {
            AudioAttributesCompatParcelizer().write(p3, p0, p1, p2);
        }
    }
}

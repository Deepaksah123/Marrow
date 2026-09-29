package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0005\u0010\n"}, d2 = {"Lo/_handleOddName;", "Lo/setImageDisplayMode;", "p0", "Lo/_resizeAndFindOffsetForAdd;", "p1", "read", "(Lo/_handleOddName;Lo/setImageDisplayMode;Lo/_resizeAndFindOffsetForAdd;)Lo/_handleOddName;", "Lo/constructType;", "", "", "(Landroid/view/KeyEvent;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OverlayListView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements getAnswerMap<constructType, Boolean> {
        final /* synthetic */ _resizeAndFindOffsetForAdd RemoteActionCompatParcelizer;
        final /* synthetic */ setImageDisplayMode read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(constructType constructtype) {
            return read(constructtype.getRead());
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean read(android.view.KeyEvent r3) {
            /*
                r2 = this;
                android.view.InputDevice r0 = r3.getDevice()
                if (r0 == 0) goto L9e
                r1 = 513(0x201, float:7.19E-43)
                boolean r1 = r0.supportsSource(r1)
                if (r1 == 0) goto L9e
                boolean r0 = r0.isVirtual()
                if (r0 == 0) goto L1d
                int r0 = r3.getSource()
                r1 = 33554433(0x2000001, float:9.403956E-38)
                if (r0 != r1) goto L9e
            L1d:
                int r0 = kotlin._throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(r3)
                o._throwNotASubtype$write r1 = kotlin._throwNotASubtype.INSTANCE
                int r1 = r1.read()
                boolean r0 = kotlin._throwNotASubtype.read(r0, r1)
                if (r0 == 0) goto L9e
                int r0 = r3.getSource()
                r1 = 257(0x101, float:3.6E-43)
                if (r0 == r1) goto L9e
                r0 = 19
                boolean r0 = kotlin.OverlayListView.AudioAttributesCompatParcelizer(r3, r0)
                if (r0 == 0) goto L4a
                o._resizeAndFindOffsetForAdd r2 = r2.RemoteActionCompatParcelizer
                o._checkNeedForRehash$AudioAttributesCompatParcelizer r3 = kotlin._checkNeedForRehash.INSTANCE
                int r3 = r3.AudioAttributesImplApi21Parcelizer()
                boolean r2 = r2.RemoteActionCompatParcelizer(r3)
                goto L9f
            L4a:
                r0 = 20
                boolean r0 = kotlin.OverlayListView.AudioAttributesCompatParcelizer(r3, r0)
                if (r0 == 0) goto L5f
                o._resizeAndFindOffsetForAdd r2 = r2.RemoteActionCompatParcelizer
                o._checkNeedForRehash$AudioAttributesCompatParcelizer r3 = kotlin._checkNeedForRehash.INSTANCE
                int r3 = r3.IconCompatParcelizer()
                boolean r2 = r2.RemoteActionCompatParcelizer(r3)
                goto L9f
            L5f:
                r0 = 21
                boolean r0 = kotlin.OverlayListView.AudioAttributesCompatParcelizer(r3, r0)
                if (r0 == 0) goto L74
                o._resizeAndFindOffsetForAdd r2 = r2.RemoteActionCompatParcelizer
                o._checkNeedForRehash$AudioAttributesCompatParcelizer r3 = kotlin._checkNeedForRehash.INSTANCE
                int r3 = r3.read()
                boolean r2 = r2.RemoteActionCompatParcelizer(r3)
                goto L9f
            L74:
                r0 = 22
                boolean r0 = kotlin.OverlayListView.AudioAttributesCompatParcelizer(r3, r0)
                if (r0 == 0) goto L89
                o._resizeAndFindOffsetForAdd r2 = r2.RemoteActionCompatParcelizer
                o._checkNeedForRehash$AudioAttributesCompatParcelizer r3 = kotlin._checkNeedForRehash.INSTANCE
                int r3 = r3.MediaBrowserCompatItemReceiver()
                boolean r2 = r2.RemoteActionCompatParcelizer(r3)
                goto L9f
            L89:
                r0 = 23
                boolean r3 = kotlin.OverlayListView.AudioAttributesCompatParcelizer(r3, r0)
                if (r3 == 0) goto L9e
                o.setImageDisplayMode r2 = r2.read
                o.BaseSettings r2 = r2.getRead()
                if (r2 == 0) goto L9c
                r2.write()
            L9c:
                r2 = 1
                goto L9f
            L9e:
                r2 = 0
            L9f:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.OverlayListView.read.read(android.view.KeyEvent):java.lang.Boolean");
        }

        read(_resizeAndFindOffsetForAdd _resizeandfindoffsetforadd, setImageDisplayMode setimagedisplaymode) {
            this.RemoteActionCompatParcelizer = _resizeandfindoffsetforadd;
            this.read = setimagedisplaymode;
        }
    }

    public static final _handleOddName read(_handleOddName _handleoddname, setImageDisplayMode setimagedisplaymode, _resizeAndFindOffsetForAdd _resizeandfindoffsetforadd) {
        return converterInstance.RemoteActionCompatParcelizer(_handleoddname, new read(_resizeandfindoffsetforadd, setimagedisplaymode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(KeyEvent keyEvent, int i) {
        return C0180invalidTypeIdException.write(_throwSubtypeClassNotAllowed.IconCompatParcelizer(keyEvent)) == i;
    }
}

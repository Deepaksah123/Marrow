package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0000\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u0005H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"tryAttachComposeStackTrace", "", "", "trace", "Lkotlin/Function0;", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "attachComposeStackTrace", "appendStackTrace", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendSourceInformationStackTrace", "filterInternalFramesByGroupKey", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "appendGroupKeyStackTrace", "RuntimePackageHash", "", "IncludeDebugInfo", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _reportCantWriteValueExpectName {
    public static final boolean write(Throwable th, getCreatedOnDateMs<_verifyPrettyValueWrite> getcreatedondatems) {
        _matchFalse _matchfalse;
        _matchFalse _matchfalse2;
        List<Throwable> listWrite = getPlanName.write(th);
        int size = listWrite.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (listWrite.get(i) instanceof _matchFalse) {
                return false;
            }
        }
        try {
            _verifyPrettyValueWrite _verifyprettyvaluewriteInvoke = getcreatedondatems.invoke();
            if (_verifyprettyvaluewriteInvoke != null && !_verifyprettyvaluewriteInvoke.IconCompatParcelizer().isEmpty()) {
                z = true;
            }
            if (z) {
                toMagicModuleMetaRepoModel.write(_verifyprettyvaluewriteInvoke);
                _matchfalse2 = new _matchFalse(_verifyprettyvaluewriteInvoke);
            } else {
                _matchfalse2 = null;
            }
            _matchfalse = _matchfalse2;
        } catch (Throwable th2) {
            _matchfalse = th2;
        }
        if (_matchfalse != null) {
            getPlanName.IconCompatParcelizer(th, _matchfalse);
        }
        return z;
    }

    public static final Throwable RemoteActionCompatParcelizer(Throwable th, getCreatedOnDateMs<_verifyPrettyValueWrite> getcreatedondatems) {
        write(th, getcreatedondatems);
        return th;
    }

    public static final void read(StringBuilder sb, _verifyPrettyValueWrite _verifyprettyvaluewrite) {
        if (_verifyprettyvaluewrite.AudioAttributesCompatParcelizer()) {
            write(sb, _verifyprettyvaluewrite);
        } else {
            RemoteActionCompatParcelizer(sb, _verifyprettyvaluewrite);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r10
      0x003f: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v8 java.lang.String) binds: [B:8:0x002c, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(java.lang.StringBuilder r13, kotlin._verifyPrettyValueWrite r14) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._reportCantWriteValueExpectName.write(java.lang.StringBuilder, o._verifyPrettyValueWrite):void");
    }

    public static final List<JsonGeneratorImpl> write(_verifyPrettyValueWrite _verifyprettyvaluewrite) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        int size = _verifyprettyvaluewrite.IconCompatParcelizer().size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            JsonGeneratorImpl jsonGeneratorImpl = _verifyprettyvaluewrite.IconCompatParcelizer().get(i);
            if (!getOrderDetails.write(iArr, jsonGeneratorImpl.getAudioAttributesCompatParcelizer())) {
                if (jsonGeneratorImpl.getAudioAttributesCompatParcelizer() == 100) {
                    int i2 = i + 2;
                    if (i2 < size && _verifyprettyvaluewrite.IconCompatParcelizer().get(i2).getAudioAttributesCompatParcelizer() == 1000) {
                        break;
                    }
                    IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((List) arrayList);
                } else {
                    arrayList.add(jsonGeneratorImpl);
                }
            }
        }
        return arrayList;
    }

    public static final void RemoteActionCompatParcelizer(StringBuilder sb, _verifyPrettyValueWrite _verifyprettyvaluewrite) {
        List<JsonGeneratorImpl> listWrite = write(_verifyprettyvaluewrite);
        int size = listWrite.size();
        for (int i = 0; i < size; i++) {
            JsonGeneratorImpl jsonGeneratorImpl = listWrite.get(i);
            sb.append("\tat $$compose.m$");
            sb.append(jsonGeneratorImpl.getAudioAttributesCompatParcelizer());
            sb.append("(SourceFile:1)");
            sb.append('\n');
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        }
    }
}

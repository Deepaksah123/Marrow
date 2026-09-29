package kotlin;

import kotlin.CurrentQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class getWidevineMode {
    public static final void write(final getSeekCount<?> getseekcount, CurrentQuery currentQuery) {
        if (((Number) currentQuery.fold(0, new MagicModuleSubmissionRequestBody() { // from class: o.getWvVideoLevel
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(getWidevineMode.IconCompatParcelizer(getseekcount, ((Integer) obj).intValue(), (CurrentQuery.write) obj2));
            }
        })).intValue() == getseekcount.AudioAttributesCompatParcelizer) {
            return;
        }
        StringBuilder sb = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
        sb.append(getseekcount.RemoteActionCompatParcelizer);
        sb.append(",\n\t\tbut emission happened in ");
        sb.append(currentQuery);
        sb.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(getSeekCount getseekcount, int i, CurrentQuery.write writeVar) {
        CurrentQuery.IconCompatParcelizer<?> key = writeVar.getKey();
        CurrentQuery.write writeVar2 = getseekcount.RemoteActionCompatParcelizer.get(key);
        if (key != setPassingYear.b_) {
            if (writeVar != writeVar2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        setPassingYear setpassingyear = (setPassingYear) writeVar2;
        toMagicModuleMetaRepoModel.read(writeVar, "");
        setPassingYear setpassingyearWrite = write((setPassingYear) writeVar, setpassingyear);
        if (setpassingyearWrite == setpassingyear) {
            return setpassingyear == null ? i : i + 1;
        }
        StringBuilder sb = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
        sb.append(setpassingyearWrite);
        sb.append(", expected child of ");
        sb.append(setpassingyear);
        sb.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
        throw new IllegalStateException(sb.toString().toString());
    }

    private static setPassingYear write(setPassingYear setpassingyear, setPassingYear setpassingyear2) {
        while (setpassingyear != null) {
            if (setpassingyear == setpassingyear2 || !(setpassingyear instanceof setWvVideoLevel)) {
                return setpassingyear;
            }
            setpassingyear = ((setWvVideoLevel) setpassingyear).onCustomAction();
        }
        return null;
    }
}

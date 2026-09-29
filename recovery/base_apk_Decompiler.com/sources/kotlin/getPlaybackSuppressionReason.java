package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class getPlaybackSuppressionReason extends RuntimeException {
    getPlaybackSuppressionReason(getCurrentPeriodIndex getcurrentperiodindex, int i) {
        this(getcurrentperiodindex, "", i);
    }

    getPlaybackSuppressionReason(getCurrentPeriodIndex getcurrentperiodindex, String str, int i) {
        super(RemoteActionCompatParcelizer(getcurrentperiodindex, str, i));
    }

    private static String RemoteActionCompatParcelizer(getCurrentPeriodIndex getcurrentperiodindex, String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" Position: ");
        sb.append(i);
        sb.append(" Model: ");
        sb.append(getcurrentperiodindex.toString());
        sb.append("\n\nEpoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.");
        return sb.toString();
    }
}

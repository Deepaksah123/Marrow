package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class addTrackSelectionForSingleRenderer implements isAfterLast {
    private final moveToLast IconCompatParcelizer;

    public addTrackSelectionForSingleRenderer(moveToLast movetolast) {
        this.IconCompatParcelizer = movetolast;
    }

    @Override // kotlin.isAfterLast
    public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        isLast islast = (isLast) downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer().getAnnotation(isLast.class);
        if (islast == null) {
            return null;
        }
        return (isBeforeFirst<T>) write(this.IconCompatParcelizer, setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda3, islast);
    }

    static isBeforeFirst<?> write(moveToLast movetolast, setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<?> downloadHelperExternalSyntheticLambda3, isLast islast) {
        isBeforeFirst<?> getmappedtrackinfo;
        Object objWrite = movetolast.write(DownloadHelperExternalSyntheticLambda3.IconCompatParcelizer(islast.AudioAttributesCompatParcelizer())).write();
        boolean zIconCompatParcelizer = islast.IconCompatParcelizer();
        if (objWrite instanceof isBeforeFirst) {
            getmappedtrackinfo = (isBeforeFirst) objWrite;
        } else if (objWrite instanceof isAfterLast) {
            getmappedtrackinfo = ((isAfterLast) objWrite).write(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda3);
        } else {
            boolean z = objWrite instanceof DownloadState;
            if (z || (objWrite instanceof DefaultDownloadIndex1)) {
                getmappedtrackinfo = new getMappedTrackInfo<>(z ? (DownloadState) objWrite : null, objWrite instanceof DefaultDownloadIndex1 ? (DefaultDownloadIndex1) objWrite : null, setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda3, zIconCompatParcelizer);
                zIconCompatParcelizer = false;
            } else {
                StringBuilder sb = new StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(objWrite.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(downloadHelperExternalSyntheticLambda3.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (getmappedtrackinfo == null || !zIconCompatParcelizer) ? getmappedtrackinfo : getmappedtrackinfo.read();
    }
}

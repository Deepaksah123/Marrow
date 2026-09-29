package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes5.dex */
class StreamMap {
    int[] fileFolderIndex;
    int[] folderFirstFileIndex;
    int[] folderFirstPackStreamIndex;
    long[] packStreamOffsets;

    StreamMap() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StreamMap with indices of ");
        sb.append(this.folderFirstPackStreamIndex.length);
        sb.append(" folders, offsets of ");
        sb.append(this.packStreamOffsets.length);
        sb.append(" packed streams, first files of ");
        sb.append(this.folderFirstFileIndex.length);
        sb.append(" folders and folder indices for ");
        sb.append(this.fileFolderIndex.length);
        sb.append(" files");
        return sb.toString();
    }
}

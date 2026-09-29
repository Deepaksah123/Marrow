package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes5.dex */
public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20130101;
    private final ZipArchiveEntry entry;
    private final Feature reason;

    public UnsupportedZipFeatureException(Feature feature, ZipArchiveEntry zipArchiveEntry) {
        StringBuilder sb = new StringBuilder("unsupported feature ");
        sb.append(feature);
        sb.append(" used in entry ");
        sb.append(zipArchiveEntry.getName());
        super(sb.toString());
        this.reason = feature;
        this.entry = zipArchiveEntry;
    }

    public UnsupportedZipFeatureException(ZipMethod zipMethod, ZipArchiveEntry zipArchiveEntry) {
        StringBuilder sb = new StringBuilder("unsupported feature method '");
        sb.append(zipMethod.name());
        sb.append("' used in entry ");
        sb.append(zipArchiveEntry.getName());
        super(sb.toString());
        this.reason = Feature.METHOD;
        this.entry = zipArchiveEntry;
    }

    public UnsupportedZipFeatureException(Feature feature) {
        StringBuilder sb = new StringBuilder("unsupported feature ");
        sb.append(feature);
        sb.append(" used in archive.");
        super(sb.toString());
        this.reason = feature;
        this.entry = null;
    }

    public Feature getFeature() {
        return this.reason;
    }

    public ZipArchiveEntry getEntry() {
        return this.entry;
    }

    public static class Feature {
        private final String name;
        public static final Feature ENCRYPTION = new Feature("encryption");
        public static final Feature METHOD = new Feature("compression method");
        public static final Feature DATA_DESCRIPTOR = new Feature("data descriptor");
        public static final Feature SPLITTING = new Feature("splitting");

        private Feature(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }
}

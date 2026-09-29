package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public abstract String transform(String str);

    protected static final class NopTransformer extends NameTransformer implements Serializable {
        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String transform(String str) {
            return str;
        }

        protected NopTransformer() {
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = false;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z = true;
        }
        if (z2) {
            if (z) {
                return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
                    @Override // com.fasterxml.jackson.databind.util.NameTransformer
                    public final String transform(String str3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str3);
                        sb.append(str2);
                        return sb.toString();
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("[PreAndSuffixTransformer('");
                        sb.append(str);
                        sb.append("','");
                        sb.append(str2);
                        sb.append("')]");
                        return sb.toString();
                    }
                };
            }
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public final String transform(String str3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str3);
                    return sb.toString();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("[PrefixTransformer('");
                    sb.append(str);
                    sb.append("')]");
                    return sb.toString();
                }
            };
        }
        if (z) {
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public final String transform(String str3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str2);
                    return sb.toString();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("[SuffixTransformer('");
                    sb.append(str2);
                    sb.append("')]");
                    return sb.toString();
                }
            };
        }
        return NOP;
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static class Chained extends NameTransformer implements Serializable {
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[ChainedTransformer(");
            sb.append(this._t1);
            sb.append(", ");
            sb.append(this._t2);
            sb.append(")]");
            return sb.toString();
        }
    }
}

package kotlin;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class callBy {
    public static final void AudioAttributesCompatParcelizer(Set<Integer> set, Set<Integer> set2) {
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(set2, "");
        if (set.isEmpty()) {
            return;
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (set2.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ".concat(String.valueOf(iIntValue)).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(kotlin.ValueClassSerializerStaticJsonValue r10, kotlin.UShortDeserializer r11) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r10, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r11, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r1 = r10.RatingCompat()
            int r2 = r1.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r4 = r1.hasNext()
            r5 = 1
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r1.next()
            o.isHdPlaybackError r4 = (kotlin.isHdPlaybackError) r4
            java.util.List<o.setVisibleXRangeMaximum> r6 = r11.IconCompatParcelizer
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 - r5
            r7 = -1
            if (r6 < 0) goto L4d
        L36:
            int r8 = r6 + (-1)
            java.util.List<o.setVisibleXRangeMaximum> r9 = r11.IconCompatParcelizer
            java.lang.Object r9 = r9.get(r6)
            boolean r9 = r4.AudioAttributesCompatParcelizer(r9)
            if (r9 == 0) goto L48
            r3[r6] = r5
            r7 = r6
            goto L4d
        L48:
            if (r8 >= 0) goto L4b
            goto L4d
        L4b:
            r6 = r8
            goto L36
        L4d:
            if (r7 < 0) goto L59
            java.util.List<o.setVisibleXRangeMaximum> r5 = r11.IconCompatParcelizer
            java.lang.Object r5 = r5.get(r7)
            r0.put(r4, r5)
            goto L1d
        L59:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "A required auto migration spec ("
            r10.<init>(r11)
            java.lang.String r11 = r4.AudioAttributesImplBaseParcelizer()
            r10.append(r11)
            java.lang.String r11 = ") is missing in the database configuration."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L7a:
            java.util.List<o.setVisibleXRangeMaximum> r1 = r11.IconCompatParcelizer
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 - r5
            if (r1 < 0) goto L9d
        L85:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L91
            boolean r1 = r3[r1]
            if (r1 == 0) goto L91
            if (r4 < 0) goto L9d
            r1 = r4
            goto L85
        L91:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L9d:
            java.util.List r10 = r10.write(r0)
            java.util.Iterator r10 = r10.iterator()
        La5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r10.next()
            o.setVisibleYRange r0 = (kotlin.setVisibleYRange) r0
            o.ValueClassSerializerStaticJsonValue$write r1 = r11.MediaBrowserCompatSearchResultReceiver
            int r2 = r0.read
            int r3 = r0.RemoteActionCompatParcelizer
            boolean r1 = r1.AudioAttributesCompatParcelizer(r2, r3)
            if (r1 != 0) goto La5
            o.ValueClassSerializerStaticJsonValue$write r1 = r11.MediaBrowserCompatSearchResultReceiver
            r1.write(r0)
            goto La5
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.callBy.RemoteActionCompatParcelizer(o.ValueClassSerializerStaticJsonValue, o.UShortDeserializer):void");
    }

    public static final void write(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, UShortDeserializer uShortDeserializer) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        toMagicModuleMetaRepoModel.write(uShortDeserializer, "");
        Map<isHdPlaybackError<?>, List<isHdPlaybackError<?>>> mapMediaBrowserCompatMediaItem = valueClassSerializerStaticJsonValue.MediaBrowserCompatMediaItem();
        boolean[] zArr = new boolean[mapMediaBrowserCompatMediaItem.size()];
        for (Map.Entry<isHdPlaybackError<?>, List<isHdPlaybackError<?>>> entry : mapMediaBrowserCompatMediaItem.entrySet()) {
            isHdPlaybackError<?> key = entry.getKey();
            for (isHdPlaybackError<?> ishdplaybackerror : entry.getValue()) {
                int size = uShortDeserializer.onPause.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        if (ishdplaybackerror.AudioAttributesCompatParcelizer(uShortDeserializer.onPause.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i < 0) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    StringBuilder sb = new StringBuilder("A required type converter (");
                    sb.append(ishdplaybackerror.AudioAttributesImplBaseParcelizer());
                    sb.append(") for ");
                    sb.append(key.AudioAttributesImplBaseParcelizer());
                    sb.append(" is missing in the database configuration.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                valueClassSerializerStaticJsonValue.write(ishdplaybackerror, uShortDeserializer.onPause.get(size));
            }
        }
        int size2 = uShortDeserializer.onPause.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            if (!zArr[size2]) {
                Object obj = uShortDeserializer.onPause.get(size2);
                StringBuilder sb2 = new StringBuilder("Unexpected type converter ");
                sb2.append(obj);
                sb2.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                throw new IllegalArgumentException(sb2.toString());
            }
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }
}

package com.marrow.data.api.models.response.lesson.step;

import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import com.marrow.data.api.models.response.lesson.InteractiveVideoElementRSModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00050\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;", "toUiModel", "(Ljava/util/List;)Ljava/util/List;", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementRSModel;", "", "p0", "toLSModel", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class InteractiveVideoElementTransformerKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.marrow.data.api.models.response.lesson.InteractiveVideoElementUiModel> toUiModel(java.util.List<com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel> r11) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r11 = r11.iterator()
        L12:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r11.next()
            r2 = r1
            com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel r2 = (com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel) r2
            java.lang.String r2 = r2.getAnswer()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L12
            r0.add(r1)
            goto L12
        L2f:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r0, r1)
            r11.<init>(r1)
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel r1 = (com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel) r1
            java.lang.String r3 = r1.getId()
            int r4 = r1.getStartTime()
            int r5 = r1.getEndTime()
            java.lang.String r1 = r1.getAnswer()
            int r2 = r1.hashCode()
            switch(r2) {
                case -79017241: goto L89;
                case -79017240: goto L7e;
                case -79017239: goto L73;
                case -79017238: goto L68;
                default: goto L67;
            }
        L67:
            goto L94
        L68:
            java.lang.String r2 = "option_4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            com.marrow.data.api.models.response.lesson.InteractiveMcqOption r1 = com.marrow.data.api.models.response.lesson.InteractiveMcqOption.OPTION_D
            goto L96
        L73:
            java.lang.String r2 = "option_3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            com.marrow.data.api.models.response.lesson.InteractiveMcqOption r1 = com.marrow.data.api.models.response.lesson.InteractiveMcqOption.OPTION_C
            goto L96
        L7e:
            java.lang.String r2 = "option_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            com.marrow.data.api.models.response.lesson.InteractiveMcqOption r1 = com.marrow.data.api.models.response.lesson.InteractiveMcqOption.OPTION_B
            goto L96
        L89:
            java.lang.String r2 = "option_1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            com.marrow.data.api.models.response.lesson.InteractiveMcqOption r1 = com.marrow.data.api.models.response.lesson.InteractiveMcqOption.OPTION_A
            goto L96
        L94:
            com.marrow.data.api.models.response.lesson.InteractiveMcqOption r1 = com.marrow.data.api.models.response.lesson.InteractiveMcqOption.INVALID
        L96:
            r6 = r1
            com.marrow.data.api.models.response.lesson.InteractiveVideoElementUiModel r1 = new com.marrow.data.api.models.response.lesson.InteractiveVideoElementUiModel
            r7 = 0
            r8 = 0
            r9 = 32
            r10 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.add(r1)
            goto L44
        La6:
            java.util.List r11 = (java.util.List) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.api.models.response.lesson.step.InteractiveVideoElementTransformerKt.toUiModel(java.util.List):java.util.List");
    }

    public static final List<InteractiveVideoElementLSModel> toLSModel(List<InteractiveVideoElementRSModel> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        List<InteractiveVideoElementRSModel> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (InteractiveVideoElementRSModel interactiveVideoElementRSModel : list2) {
            int startTime = interactiveVideoElementRSModel.getStartTime();
            int endTime = interactiveVideoElementRSModel.getEndTime();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(startTime);
            sb.append("_");
            sb.append(endTime);
            arrayList.add(new InteractiveVideoElementLSModel(sb.toString(), str, interactiveVideoElementRSModel.getStartTime(), interactiveVideoElementRSModel.getEndTime(), interactiveVideoElementRSModel.getAnswer()));
        }
        return arrayList;
    }
}

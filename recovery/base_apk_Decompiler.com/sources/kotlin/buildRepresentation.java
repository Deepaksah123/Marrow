package kotlin;

import com.marrow.data.models.test.RankPair;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TestMini;
import com.marrow.data.models.test.TestStat;
import com.marrow.data.models.test.TestSubjectStat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class buildRepresentation {
    public static JSONArray AudioAttributesCompatParcelizer(TestSubjectStat[] testSubjectStatArr) {
        JSONArray jSONArray = new JSONArray();
        if (testSubjectStatArr != null) {
            for (TestSubjectStat testSubjectStat : testSubjectStatArr) {
                JSONObject jSONObjectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(testSubjectStat);
                isDvbProfileDeclared.write(jSONObjectRemoteActionCompatParcelizer, "subject_id", testSubjectStat.subjectId);
                isDvbProfileDeclared.read(jSONObjectRemoteActionCompatParcelizer, "percentile", Double.valueOf(testSubjectStat.percentile));
                jSONArray.put(jSONObjectRemoteActionCompatParcelizer);
            }
        }
        return jSONArray;
    }

    public static JSONArray AudioAttributesCompatParcelizer(RankPair[] rankPairArr) {
        JSONArray jSONArray = new JSONArray();
        if (rankPairArr != null) {
            for (RankPair rankPair : rankPairArr) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(rankPair.scoreRange);
                jSONArray2.put(rankPair.rankRange);
                jSONArray.put(jSONArray2);
            }
        }
        return jSONArray;
    }

    public static RankPair[] RemoteActionCompatParcelizer(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        RankPair[] rankPairArr = new RankPair[length];
        for (int i = 0; i < length; i++) {
            JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
            RankPair rankPair = new RankPair();
            rankPairArr[i] = rankPair;
            rankPair.scoreRange = jSONArrayOptJSONArray.optString(0);
            rankPairArr[i].rankRange = jSONArrayOptJSONArray.optString(1);
        }
        return rankPairArr;
    }

    public static TestSubjectStat[] AudioAttributesCompatParcelizer(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        TestSubjectStat[] testSubjectStatArr = new TestSubjectStat[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            TestSubjectStat testSubjectStat = new TestSubjectStat();
            testSubjectStatArr[i] = testSubjectStat;
            if (jSONObjectOptJSONObject != null) {
                AudioAttributesCompatParcelizer(testSubjectStat, jSONObjectOptJSONObject);
                testSubjectStatArr[i].percentile = jSONObjectOptJSONObject.optDouble("percentile");
                testSubjectStatArr[i].subjectId = jSONObjectOptJSONObject.optString("subject_id");
            }
        }
        return testSubjectStatArr;
    }

    private static <T extends TestStat> void AudioAttributesCompatParcelizer(T t, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        t.correct = jSONObject.optInt("correct");
        t.wrong = jSONObject.optInt("wrong");
        t.score = jSONObject.optInt("score");
        t.total = jSONObject.optInt("total");
        t.possibleScore = jSONObject.optInt("possible_score");
    }

    public static TestStat IconCompatParcelizer(JSONObject jSONObject) {
        TestStat testStat = new TestStat();
        AudioAttributesCompatParcelizer(testStat, jSONObject);
        return testStat;
    }

    public static JSONObject RemoteActionCompatParcelizer(TestStat testStat) {
        JSONObject jSONObject = new JSONObject();
        if (testStat != null) {
            isDvbProfileDeclared.read(jSONObject, "correct", Integer.valueOf(testStat.correct));
            isDvbProfileDeclared.read(jSONObject, "wrong", Integer.valueOf(testStat.wrong));
            isDvbProfileDeclared.read(jSONObject, "score", Double.valueOf(testStat.score));
            isDvbProfileDeclared.read(jSONObject, "total", Integer.valueOf(testStat.total));
            isDvbProfileDeclared.read(jSONObject, "possible_score", Integer.valueOf(testStat.possibleScore));
        }
        return jSONObject;
    }

    public static TestIndex[] write(TestIndex[] testIndexArr) {
        if (testIndexArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TestIndex testIndex : testIndexArr) {
            if (!testIndex.isPublished()) {
                arrayList.add(testIndex);
            }
        }
        return (TestIndex[]) arrayList.toArray(new TestIndex[arrayList.size()]);
    }

    public static TestIndex[] IconCompatParcelizer(TestIndex[] testIndexArr) {
        if (testIndexArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TestIndex testIndex : testIndexArr) {
            if (testIndex.isPublished()) {
                arrayList.add(testIndex);
            }
        }
        return (TestIndex[]) arrayList.toArray(new TestIndex[arrayList.size()]);
    }

    public static String[] AudioAttributesCompatParcelizer(TestIndex[] testIndexArr) {
        if (testIndexArr == null) {
            return null;
        }
        int length = testIndexArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = testIndexArr[i].getId();
        }
        return strArr;
    }

    public static int write(TestMini testMini) {
        if (IconCompatParcelizer(testMini)) {
            return 1;
        }
        if (read(testMini)) {
            return 2;
        }
        return AudioAttributesCompatParcelizer(testMini) ? 3 : 4;
    }

    private static boolean IconCompatParcelizer(TestMini testMini) {
        return (AudioAttributesCompatParcelizer(testMini) || read(testMini)) ? false : true;
    }

    private static boolean AudioAttributesCompatParcelizer(TestMini testMini) {
        return testMini.getStartTimestamp() > System.currentTimeMillis();
    }

    private static boolean read(TestMini testMini) {
        return testMini.getEndTimestamp() < System.currentTimeMillis();
    }
}

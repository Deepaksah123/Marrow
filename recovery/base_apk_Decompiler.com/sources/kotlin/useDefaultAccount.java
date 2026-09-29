package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/useDefaultAccount;", "", "<init>", "()V", "", "write", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class useDefaultAccount {
    public static final useDefaultAccount INSTANCE = new useDefaultAccount();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final String read = "uniform shader content;\nuniform shader state;\nuniform float2 size;\nuniform float2 grid;\nuniform float refractStrength;\nuniform float normalScale;\nuniform float3 lightDir;\nuniform float specularPower;\nuniform float specularStrength;\nuniform float3 specularColor;\nuniform float diffuseBase;\nuniform float diffuseScale;\n\nfloat unpackHeight(float2 bits) {\n    return ((bits.x * 255.0 + bits.y) / 255.0) * 2.0 - 1.0;\n}\n\nfloat texelHeight(float2 cell) {\n    float2 clamped = clamp(cell, float2(0.5), grid - 0.5);\n    return unpackHeight(float2(state.eval(clamped).rg));\n}\n\n// The field is sampled unfiltered to keep the packing intact, so the\n// bilinear blend is done here by hand.\nfloat smoothHeight(float2 cell) {\n    float2 st = cell - 0.5;\n    float2 f = fract(st);\n    float2 base = floor(st) + 0.5;\n    float a = texelHeight(base);\n    float b = texelHeight(base + float2(1.0, 0.0));\n    float c = texelHeight(base + float2(0.0, 1.0));\n    float d = texelHeight(base + float2(1.0, 1.0));\n    return mix(mix(a, b, f.x), mix(c, d, f.x), f.y);\n}\n\nhalf4 main(float2 coord) {\n    float2 cell = (coord / size) * grid;\n    float hl = smoothHeight(cell - float2(1.0, 0.0));\n    float hr = smoothHeight(cell + float2(1.0, 0.0));\n    float hu = smoothHeight(cell - float2(0.0, 1.0));\n    float hd = smoothHeight(cell + float2(0.0, 1.0));\n    float2 grad = float2(hr - hl, hd - hu);\n\n    float2 sampleCoord = clamp(\n        coord + grad * refractStrength * size,\n        float2(0.0),\n        size\n    );\n    half4 color = content.eval(sampleCoord);\n\n    float3 normal = normalize(float3(-grad * normalScale, 1.0));\n    float3 halfDir = normalize(lightDir + float3(0.0, 0.0, 1.0));\n    float specular = pow(max(dot(normal, halfDir), 0.0), specularPower);\n    float diffuse = max(dot(normal, lightDir), 0.0);\n\n    float alpha = float(color.a);\n    float3 rgb = float3(color.rgb);\n    rgb += specularColor * specular * specularStrength * alpha;\n    rgb *= diffuseBase + diffuseScale * diffuse;\n    rgb = clamp(rgb, float3(0.0), float3(alpha));\n\n    return half4(half3(rgb), color.a);\n}";

    private useDefaultAccount() {
    }

    public static String IconCompatParcelizer() {
        return read;
    }
}

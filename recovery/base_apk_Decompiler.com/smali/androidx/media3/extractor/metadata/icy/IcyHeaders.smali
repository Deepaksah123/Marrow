###### Class androidx.media3.extractor.metadata.icy.IcyHeaders (androidx.media3.extractor.metadata.icy.IcyHeaders)
.class public final Landroidx/media3/extractor/metadata/icy/IcyHeaders;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/icy/IcyHeaders;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:I

.field public final AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field public final IconCompatParcelizer:Z

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:I

.field public final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 247
    new-instance v0, Landroidx/media3/extractor/metadata/icy/IcyHeaders$4;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/icy/IcyHeaders$4;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .registers 8

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-eq p6, v0, :cond_a

    if-gtz p6, :cond_a

    const/4 v0, 0x0

    goto :goto_b

    :cond_a
    const/4 v0, 0x1

    .line 161
    :goto_b
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 162
    iput p1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    .line 163
    iput-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 164
    iput-object p3, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    .line 165
    iput-object p4, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 166
    iput-boolean p5, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->IconCompatParcelizer:Z

    .line 167
    iput p6, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 175
    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->IconCompatParcelizer:Z

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method public static write(Ljava/util/Map;)Landroidx/media3/extractor/metadata/icy/IcyHeaders;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Landroidx/media3/extractor/metadata/icy/IcyHeaders;"
        }
    .end annotation

    .line 64
    const-string v0, "Invalid metadata interval: "

    const-string v1, "icy-br"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 65
    const-string v2, "IcyHeaders"

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_45

    .line 66
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 68
    :try_start_17
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_1b
    .catch Ljava/lang/NumberFormatException; {:try_start_17 .. :try_end_1b} :catch_34

    mul-int/lit16 v6, v6, 0x3e8

    if-lez v6, :cond_21

    move v1, v3

    goto :goto_43

    .line 72
    :cond_21
    :try_start_21
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Invalid bitrate: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lo/prune;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_32
    .catch Ljava/lang/NumberFormatException; {:try_start_21 .. :try_end_32} :catch_35

    move v6, v4

    goto :goto_42

    :catch_34
    move v6, v4

    .line 76
    :catch_35
    const-string v7, "Invalid bitrate header: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lo/prune;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)V

    :goto_42
    move v1, v5

    :goto_43
    move v7, v6

    goto :goto_47

    :cond_45
    move v7, v4

    move v1, v5

    .line 79
    :goto_47
    const-string v6, "icy-genre"

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    const/4 v8, 0x0

    if-eqz v6, :cond_5b

    .line 81
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v9, v1

    move v1, v3

    goto :goto_5c

    :cond_5b
    move-object v9, v8

    .line 84
    :goto_5c
    const-string v6, "icy-name"

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_6f

    .line 86
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v10, v1

    move v1, v3

    goto :goto_70

    :cond_6f
    move-object v10, v8

    .line 89
    :goto_70
    const-string v6, "icy-url"

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_83

    .line 91
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v11, v1

    move v1, v3

    goto :goto_84

    :cond_83
    move-object v11, v8

    .line 94
    :goto_84
    const-string v6, "icy-pub"

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_9d

    .line 96
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v6, "1"

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    move v12, v1

    move v1, v3

    goto :goto_9e

    :cond_9d
    move v12, v5

    .line 99
    :goto_9e
    const-string v6, "icy-metaint"

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_d4

    .line 101
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 103
    :try_start_ae
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_b2
    .catch Ljava/lang/NumberFormatException; {:try_start_ae .. :try_end_b2} :catch_c9

    if-lez v5, :cond_b6

    move v4, v5

    goto :goto_c6

    .line 107
    :cond_b6
    :try_start_b6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo/prune;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c5
    .catch Ljava/lang/NumberFormatException; {:try_start_b6 .. :try_end_c5} :catch_c8

    move v3, v1

    :goto_c6
    move v1, v3

    goto :goto_d4

    :catch_c8
    move v4, v5

    .line 111
    :catch_c9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lo/prune;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)V

    :cond_d4
    :goto_d4
    if-eqz v1, :cond_e2

    .line 115
    new-instance p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;

    move-object v6, p0

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move v11, v12

    move v12, v4

    invoke-direct/range {v6 .. v12}, Landroidx/media3/extractor/metadata/icy/IcyHeaders;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    move-object v8, p0

    :cond_e2
    return-object v8
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getSchema$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 181
    iget-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 182
    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    .line 184
    :cond_7
    iget-object p0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz p0, :cond_e

    .line 185
    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    :cond_e
    return-void
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_43

    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_43

    .line 197
    check-cast p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;

    .line 198
    iget v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    iget v2, p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    if-ne v1, v2, :cond_43

    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 199
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    .line 200
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 201
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    iget-boolean v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->IconCompatParcelizer:Z

    iget-boolean v2, p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->IconCompatParcelizer:Z

    if-ne v1, v2, :cond_43

    iget p0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    iget p1, p1, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    if-ne p0, p1, :cond_43

    return v0

    :cond_43
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 6

    .line 209
    iget v0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    .line 210
    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_d

    :cond_c
    move v1, v2

    .line 211
    :goto_d
    iget-object v3, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    if-eqz v3, :cond_16

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_17

    :cond_16
    move v3, v2

    .line 212
    :goto_17
    iget-object v4, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    if-eqz v4, :cond_1f

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 213
    :cond_1f
    iget-boolean v4, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->IconCompatParcelizer:Z

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    .line 214
    iget p0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IcyHeaders: name=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", genre=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", metadataInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 234
    iget p2, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 235
    iget-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    iget-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 237
    iget-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 238
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->IconCompatParcelizer:Z

    invoke-static {p1, p2}, Lo/LaissezFaireSubTypeValidator;->write(Landroid/os/Parcel;Z)V

    .line 239
    iget p0, p0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.icy.IcyHeaders.AnonymousClass4 (androidx.media3.extractor.metadata.icy.IcyHeaders$4)
.class final Landroidx/media3/extractor/metadata/icy/IcyHeaders$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/icy/IcyHeaders;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/icy/IcyHeaders;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/icy/IcyHeaders;
    .registers 2

    .line 252
    new-instance v0, Landroidx/media3/extractor/metadata/icy/IcyHeaders;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/icy/IcyHeaders;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/icy/IcyHeaders;
    .registers 1

    .line 257
    new-array p0, p0, [Landroidx/media3/extractor/metadata/icy/IcyHeaders;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 248
    invoke-static {p1}, Landroidx/media3/extractor/metadata/icy/IcyHeaders$4;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/icy/IcyHeaders;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 248
    invoke-static {p1}, Landroidx/media3/extractor/metadata/icy/IcyHeaders$4;->IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/icy/IcyHeaders;

    move-result-object p0

    return-object p0
.end method

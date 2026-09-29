###### Class androidx.media3.common.DrmInitData (androidx.media3.common.DrmInitData)
.class public final Landroidx/media3/common/DrmInitData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/common/DrmInitData$SchemeData;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/media3/common/DrmInitData$SchemeData;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/common/DrmInitData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final IconCompatParcelizer:I

.field private RemoteActionCompatParcelizer:I

.field private final write:[Landroidx/media3/common/DrmInitData$SchemeData;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 231
    new-instance v0, Landroidx/media3/common/DrmInitData$2;

    invoke-direct {v0}, Landroidx/media3/common/DrmInitData$2;-><init>()V

    sput-object v0, Landroidx/media3/common/DrmInitData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 141
    sget-object v0, Landroidx/media3/common/DrmInitData$SchemeData;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroidx/media3/common/DrmInitData$SchemeData;

    iput-object p1, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    .line 142
    array-length p1, p1

    iput p1, p0, Landroidx/media3/common/DrmInitData;->IconCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 108
    new-array v1, v0, [Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-interface {p2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-direct {p0, p1, v0, p2}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V
    .registers 4

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz p2, :cond_e

    .line 130
    invoke-virtual {p3}, [Landroidx/media3/common/DrmInitData$SchemeData;->clone()Ljava/lang/Object;

    move-result-object p1

    move-object p3, p1

    check-cast p3, [Landroidx/media3/common/DrmInitData$SchemeData;

    .line 132
    :cond_e
    iput-object p3, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    .line 133
    array-length p1, p3

    iput p1, p0, Landroidx/media3/common/DrmInitData;->IconCompatParcelizer:I

    .line 136
    invoke-static {p3, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Landroidx/media3/common/DrmInitData$SchemeData;)V
    .registers 4

    const/4 v0, 0x1

    .line 123
    invoke-direct {p0, p1, v0, p2}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 100
    new-array v1, v0, [Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroidx/media3/common/DrmInitData$SchemeData;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p1}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V

    return-void
.end method

.method public varargs constructor <init>([Landroidx/media3/common/DrmInitData$SchemeData;)V
    .registers 3

    const/4 v0, 0x0

    .line 115
    invoke-direct {p0, v0, p1}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;[Landroidx/media3/common/DrmInitData$SchemeData;)V

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Landroidx/media3/common/DrmInitData;Landroidx/media3/common/DrmInitData;)Landroidx/media3/common/DrmInitData;
    .registers 10

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p0, :cond_1f

    .line 62
    iget-object v3, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 63
    iget-object p0, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    array-length v4, p0

    move v5, v1

    :goto_f
    if-ge v5, v4, :cond_20

    aget-object v6, p0, v5

    .line 64
    invoke-virtual {v6}, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer()Z

    move-result v7

    if-eqz v7, :cond_1c

    .line 65
    invoke-virtual {v0, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_1c
    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_1f
    move-object v3, v2

    :cond_20
    if-eqz p1, :cond_46

    if-nez v3, :cond_27

    .line 72
    iget-object p0, p1, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    move-object v3, p0

    .line 74
    :cond_27
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    .line 75
    iget-object p1, p1, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    array-length v4, p1

    :goto_2e
    if-ge v1, v4, :cond_46

    aget-object v5, p1, v1

    .line 76
    invoke-virtual {v5}, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer()Z

    move-result v6

    if-eqz v6, :cond_43

    iget-object v6, v5, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-static {v0, p0, v6}, Landroidx/media3/common/DrmInitData;->write(Ljava/util/ArrayList;ILjava/util/UUID;)Z

    move-result v6

    if-nez v6, :cond_43

    .line 77
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_43
    add-int/lit8 v1, v1, 0x1

    goto :goto_2e

    .line 82
    :cond_46
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4d

    return-object v2

    :cond_4d
    new-instance p0, Landroidx/media3/common/DrmInitData;

    invoke-direct {p0, v3, v0}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroidx/media3/common/DrmInitData$SchemeData;Landroidx/media3/common/DrmInitData$SchemeData;)I
    .registers 4

    .line 213
    sget-object v0, Lo/JsonMapFormatVisitor;->read:Ljava/util/UUID;

    iget-object v1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 214
    sget-object p0, Lo/JsonMapFormatVisitor;->read:Ljava/util/UUID;

    iget-object p1, p1, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x0

    return p0

    :cond_16
    const/4 p0, 0x1

    return p0

    .line 215
    :cond_18
    iget-object p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    iget-object p1, p1, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Ljava/util/UUID;->compareTo(Ljava/util/UUID;)I

    move-result p0

    return p0
.end method

.method private static write(Ljava/util/ArrayList;ILjava/util/UUID;)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;I",
            "Ljava/util/UUID;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    if-ge v1, p1, :cond_17

    .line 250
    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/common/DrmInitData$SchemeData;

    iget-object v2, v2, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {v2, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_17
    return v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/media3/common/DrmInitData;)Landroidx/media3/common/DrmInitData;
    .registers 4

    .line 178
    iget-object v0, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz v0, :cond_10

    iget-object v1, p1, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz v1, :cond_10

    .line 181
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x0

    goto :goto_11

    :cond_10
    const/4 v0, 0x1

    .line 178
    :goto_11
    invoke-static {v0}, Lo/buildTypeSerializer;->write(Z)V

    .line 182
    iget-object v0, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-nez v0, :cond_1a

    iget-object v0, p1, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 183
    :cond_1a
    iget-object p0, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    iget-object p1, p1, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    .line 184
    invoke-static {p0, p1}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroidx/media3/common/DrmInitData$SchemeData;

    .line 185
    new-instance p1, Landroidx/media3/common/DrmInitData;

    invoke-direct {p1, v0, p0}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;[Landroidx/media3/common/DrmInitData$SchemeData;)V

    return-object p1
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;)Landroidx/media3/common/DrmInitData;
    .registers 4

    .line 163
    iget-object v0, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v0, p1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-object p0

    .line 166
    :cond_9
    new-instance v0, Landroidx/media3/common/DrmInitData;

    const/4 v1, 0x0

    iget-object p0, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-direct {v0, p1, v1, p0}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V

    return-object v0
.end method

.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 34
    check-cast p1, Landroidx/media3/common/DrmInitData$SchemeData;

    check-cast p2, Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-static {p1, p2}, Landroidx/media3/common/DrmInitData;->RemoteActionCompatParcelizer(Landroidx/media3/common/DrmInitData$SchemeData;Landroidx/media3/common/DrmInitData$SchemeData;)I

    move-result p0

    return p0
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
    if-eqz p1, :cond_27

    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_27

    .line 206
    check-cast p1, Landroidx/media3/common/DrmInitData;

    .line 207
    iget-object v1, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    iget-object p0, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    iget-object p1, p1, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    .line 208
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_27

    return v0

    :cond_27
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 3

    .line 190
    iget v0, p0, Landroidx/media3/common/DrmInitData;->RemoteActionCompatParcelizer:I

    if-nez v0, :cond_19

    .line 191
    iget-object v0, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-nez v0, :cond_a

    const/4 v0, 0x0

    goto :goto_e

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 192
    :goto_e
    iget-object v1, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    .line 193
    iput v0, p0, Landroidx/media3/common/DrmInitData;->RemoteActionCompatParcelizer:I

    .line 195
    :cond_19
    iget p0, p0, Landroidx/media3/common/DrmInitData;->RemoteActionCompatParcelizer:I

    return p0
.end method

.method public final write(I)Landroidx/media3/common/DrmInitData$SchemeData;
    .registers 2

    .line 152
    iget-object p0, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    aget-object p0, p0, p1

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 227
    iget-object p2, p0, Landroidx/media3/common/DrmInitData;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 228
    iget-object p0, p0, Landroidx/media3/common/DrmInitData;->write:[Landroidx/media3/common/DrmInitData$SchemeData;

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class androidx.media3.common.DrmInitData.AnonymousClass2 (androidx.media3.common.DrmInitData$2)
.class final Landroidx/media3/common/DrmInitData$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/DrmInitData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/common/DrmInitData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/common/DrmInitData;
    .registers 2

    .line 236
    new-instance v0, Landroidx/media3/common/DrmInitData;

    invoke-direct {v0, p0}, Landroidx/media3/common/DrmInitData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/media3/common/DrmInitData;
    .registers 1

    .line 241
    new-array p0, p0, [Landroidx/media3/common/DrmInitData;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 232
    invoke-static {p1}, Landroidx/media3/common/DrmInitData$2;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/common/DrmInitData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 232
    invoke-static {p1}, Landroidx/media3/common/DrmInitData$2;->read(I)[Landroidx/media3/common/DrmInitData;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.common.DrmInitData.SchemeData (androidx.media3.common.DrmInitData$SchemeData)
.class public final Landroidx/media3/common/DrmInitData$SchemeData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/DrmInitData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SchemeData"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/util/UUID;

.field public final IconCompatParcelizer:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:I

.field public final read:[B

.field public final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 389
    new-instance v0, Landroidx/media3/common/DrmInitData$SchemeData$4;

    invoke-direct {v0}, Landroidx/media3/common/DrmInitData$SchemeData$4;-><init>()V

    sput-object v0, Landroidx/media3/common/DrmInitData$SchemeData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 7

    .line 303
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 304
    new-instance v0, Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    .line 305
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    .line 306
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    .line 307
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V
    .registers 5

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/UUID;

    iput-object p1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    .line 298
    iput-object p2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    .line 299
    invoke-static {p3}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lo/DefaultBaseTypeLimitingValidator;->MediaMetadataCompat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    .line 300
    iput-object p4, p0, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;[B)V
    .registers 5

    const/4 v0, 0x0

    .line 285
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer([B)Landroidx/media3/common/DrmInitData$SchemeData;
    .registers 5

    .line 343
    new-instance v0, Landroidx/media3/common/DrmInitData$SchemeData;

    iget-object v1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    iget-object v2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    iget-object p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p0, p1}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object v0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 332
    iget-object p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/media3/common/DrmInitData$SchemeData;)Z
    .registers 3

    .line 327
    invoke-virtual {p0}, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {p1}, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-nez v0, :cond_16

    iget-object p1, p1, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Landroidx/media3/common/DrmInitData$SchemeData;->read(Ljava/util/UUID;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    .line 348
    instance-of v0, p1, Landroidx/media3/common/DrmInitData$SchemeData;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x1

    if-ne p1, p0, :cond_a

    return v0

    .line 354
    :cond_a
    check-cast p1, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 355
    iget-object v2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    iget-object v3, p1, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    invoke-static {v2, v3}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    iget-object v2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    .line 356
    invoke-static {v2, v3}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    iget-object v2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    iget-object v3, p1, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    .line 357
    invoke-static {v2, v3}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    iget-object p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    iget-object p1, p1, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    .line 358
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_35

    return v0

    :cond_35
    return v1
.end method

.method public final hashCode()I
    .registers 5

    .line 363
    iget v0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer:I

    if-nez v0, :cond_2b

    .line 364
    iget-object v0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 365
    iget-object v1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    if-nez v1, :cond_10

    const/4 v1, 0x0

    goto :goto_14

    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 366
    :goto_14
    iget-object v2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 367
    iget-object v3, p0, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    .line 368
    iput v0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer:I

    .line 370
    :cond_2b
    iget p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->RemoteActionCompatParcelizer:I

    return p0
.end method

.method public final read(Ljava/util/UUID;)Z
    .registers 4

    .line 317
    sget-object v0, Lo/JsonMapFormatVisitor;->read:Ljava/util/UUID;

    iget-object v1, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    iget-object p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    const/4 p0, 0x0

    return p0

    :cond_14
    const/4 p0, 0x1

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 382
    iget-object p2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {p2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 383
    iget-object p2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->AudioAttributesCompatParcelizer:Ljava/util/UUID;

    invoke-virtual {p2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 384
    iget-object p2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 385
    iget-object p2, p0, Landroidx/media3/common/DrmInitData$SchemeData;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 386
    iget-object p0, p0, Landroidx/media3/common/DrmInitData$SchemeData;->read:[B

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

###### Class androidx.media3.common.DrmInitData.SchemeData.AnonymousClass4 (androidx.media3.common.DrmInitData$SchemeData$4)
.class final Landroidx/media3/common/DrmInitData$SchemeData$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/DrmInitData$SchemeData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/common/DrmInitData$SchemeData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/media3/common/DrmInitData$SchemeData;
    .registers 1

    .line 399
    new-array p0, p0, [Landroidx/media3/common/DrmInitData$SchemeData;

    return-object p0
.end method

.method private static read(Landroid/os/Parcel;)Landroidx/media3/common/DrmInitData$SchemeData;
    .registers 2

    .line 394
    new-instance v0, Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-direct {v0, p0}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 390
    invoke-static {p1}, Landroidx/media3/common/DrmInitData$SchemeData$4;->read(Landroid/os/Parcel;)Landroidx/media3/common/DrmInitData$SchemeData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 390
    invoke-static {p1}, Landroidx/media3/common/DrmInitData$SchemeData$4;->RemoteActionCompatParcelizer(I)[Landroidx/media3/common/DrmInitData$SchemeData;

    move-result-object p0

    return-object p0
.end method

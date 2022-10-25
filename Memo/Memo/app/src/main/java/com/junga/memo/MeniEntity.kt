import androidx.room.Entity
import androidx.room.PrimaryKey

// - 엔티티는 하나의 테이블임,모든 엔티티는 프라이머리 1개 필수 포함
@Entity(tableName="memo")
data class MemoEntity(
    @PrimaryKey(autoGenerate = true)
    var id : Long?,
    var memo : String = "")
